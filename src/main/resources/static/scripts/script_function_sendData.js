
function sendData() {
        const string1 = document.getElementById("string1").value;
        const string2 = document.getElementById("string2").value;

        const data = {
          string1,
          string2
        };

        fetch("/sendData", {
          method: "POST",
          headers: {
            "Content-Type": "application/json"
          },
          body: JSON.stringify(data)
        })
          .then(response => {
            if (!response.ok) {
              throw new Error("Erro ao enviar dados");
            }
            return response.text();
          })
          .then(message => {
            alert(message);
          })
          .catch(error => {
            alert(error.message);
          });
      }

function deleteData() {
        const id = document.getElementById("id").value;

        fetch(`/sendData?id=${id}`, {
          method: "DELETE"
        })
          .then(response => {
            if (!response.ok) {
              throw new Error("Erro ao excluir dados");
            }
            return response.text();
          })
          .then(message => {
            alert(message);
          })
          .catch(error => {
            alert(error.message);
          });
      }

function updateData() {
        const string1 = document.getElementById("string12").value;
        const string2 = document.getElementById("string22").value;

        const data = {
          string1,
          string2
        };

        fetch("/sendData", {
          method: "PUT",
          headers: {
            "Content-Type": "application/json"
          },
          body: JSON.stringify(data)
        })
          .then(response => {
            if (!response.ok) {
              throw new Error("Erro ao atualizar dados");
            }
            return response.text();
          })
          .then(message => {
            alert(message);
          })
          .catch(error => {
            alert(error.message);
          });
      }