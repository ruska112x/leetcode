```bash
javac \<FileName>.java && java -cp . \<PublicClassName>
```

```bash
javac \<FileName>.java
```

```bash
jar cvf \<JarName>.jar \<PublicClassName>.class
```

```bash
java -cp \<JarName>.jar \<PublicClassName>
```

# Kotlin:
```bash
kotlinc name.kt -include-runtime -d name.jar
```

```bash
java -jar name.jar
```
Run script:
Example:
```kotlin
import java.io.File

// Get the passed in path, i.e. "-d some/path" or use the current path.
val path = if (args.contains("-d")) args[1 + args.indexOf("-d")]
           else "."

val folders = File(path).listFiles { file -> file.isDirectory() }
folders?.forEach { folder -> println(folder) }
```

```bash
kotlinc -script list_folders.kts -- -d <path_to_folder_to_inspect>
```
