var addTwoPromises = async (promise1, promise2) => {
    var x = 0;
    await promise1.then(v => x += v)
    await promise2.then(v => x += v)
    return x;
}
