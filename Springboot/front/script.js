document.addEventListener("DOMContentLoaded", () => {
    const createUserForm = document.getElementById("createUserForm");
    const editUserForm = document.getElementById("editUserForm");
    const deleteUserForm = document.getElementById("deleteUserForm");
    const refreshUsersButton = document.getElementById("refreshUsers");
    const usersList = document.getElementById("users");

    createUserForm.addEventListener("submit", function (e) {
        e.preventDefault();
        const name = document.getElementById("name").value;

        fetch("http://localhost:8082/users_create", {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify({ name }),
        })
            .then(response => response.json())
            .then(data => {
                alert("User created successfully!");
                refreshUsers();
            })
            .catch(error => console.error("Error:", error)); 
    });

    editUserForm.addEventListener("submit", function (e) {
        e.preventDefault();
        const id = document.getElementById("editId").value;
        const name = document.getElementById("editName").value;

        fetch(`http://localhost:8082/users/${id}`, {
            method: "PUT",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify({ name }),
        })
            .then(response => response.json())
            .then(data => {
                alert("User updated successfully!");
                refreshUsers();
            })
            .catch(error => console.error("Error:", error));
    });

    deleteUserForm.addEventListener("submit", function (e) {
        e.preventDefault();
        const id = document.getElementById("deleteId").value;

        fetch(`http://localhost:8082/users/delete/${id}`, {
            method: "GET",
        })
            .then(response => response.text())
            .then(data => {
                alert(data);
                refreshUsers();
            })
            .catch(error => console.error("Error:", error));
    });

    refreshUsersButton.addEventListener("click", refreshUsers);

    function refreshUsers() {
        fetch("http://localhost:8082/users")
            .then(response => response.json())
            .then(data => {
                usersList.innerHTML = "";
                data.forEach(user => {
                    const li = document.createElement("li");
                    li.textContent = `ID: ${user.id}, Name: ${user.name}`;
                    usersList.appendChild(li);
                });
            })
            .catch(error => console.error("Error:", error));
    }

    // Initially load users
    refreshUsers();
});
