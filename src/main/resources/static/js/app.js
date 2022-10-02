
function getDetails() {
    fetch('/api/details').then(function(response) {
        let resp =  response.json()
        console.log(resp)
    }).then((data) => {
        console.log(data)
    })
}