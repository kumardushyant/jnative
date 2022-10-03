
function getDetails() {
    fetch('/api/details').then((response) => {
        response.json().then((data)=> {
            console.log(data)
            document.getElementById('host').innerHTML = data.host
        });
    }).then((data) => {
        console.log("Completed")
    })
}