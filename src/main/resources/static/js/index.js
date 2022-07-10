async function getUsers() {
    const rawResponse = await fetch("/get_users", {
        method: 'GET',
        headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
        }
    });
    const dataJSON = await rawResponse.json();

    let listHTML = "";
    for ( let data of dataJSON ) {
        listHTML += 
        "<tr>"+
        "<td>"+data.id+"</td>"+
        "<td>"+data.name+"</td>"+
        "<td>"+data.email+"</td>"+
        "</tr>";
    }
    document.querySelector("tbody").outerHTML = listHTML;
}