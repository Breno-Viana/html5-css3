document.getElementById('addCliente').addEventListener('click', function() {
    const nome = document.getElementById('nome').value;
    const idade = document.getElementById('idade').value;

    if (nome && idade) {
        const cliente = { nome: nome, idade: idade };
        let clientes = JSON.parse(localStorage.getItem('clientes')) || [];
        clientes.push(cliente);
        localStorage.setItem('clientes', JSON.stringify(clientes));
        document.getElementById('nome').value = '';
        document.getElementById('idade').value = '';
        alert('Cliente adicionado com sucesso!');
    } else {
        alert('Por favor, preencha todos os campos.');
    }
});

document.getElementById('showClientes').addEventListener('click', function() {
    let clientes = JSON.parse(localStorage.getItem('clientes')) || [];
    const clientesList = document.getElementById('clientesList');
    clientesList.innerHTML = '';
    if (clientes.length > 0) {
        clientes.forEach(function(cliente) {
            const div = document.createElement('div');
            div.textContent = `Nome: ${cliente.nome}, Idade: ${cliente.idade}`;
            clientesList.appendChild(div);
        });
    } else {
        clientesList.innerHTML = 'Nenhum cliente cadastrado.';
    }
});
