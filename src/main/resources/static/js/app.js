
function getDetails() {
    fetch('/api/details').then((response) => {
        response.json().then((data)=> {
            console.log(data)
            document.getElementById('host').innerHTML = data.host
            document.getElementById('podName').innerHTML = data.podName
            document.getElementById('nodeName').innerHTML = data.nodeName
            document.getElementById('nameSpace').innerHTML = data.nameSpace
        });
    }).then((data) => {
        console.log("Completed")
    })
}