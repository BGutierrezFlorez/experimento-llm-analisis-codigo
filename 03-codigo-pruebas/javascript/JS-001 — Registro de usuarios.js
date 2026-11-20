
function registrarUsuario(nombre, edad, correo) {
    if (nombre === "") {
        console.log("El nombre es obligatorio");
        return;
    }

    if (edad < 18) {
        console.log("El usuario debe ser mayor de edad");
        return;
    }

    const usuario = {
        nombre: nombre,
        edad: edad,
        correo: correo
    };

    console.log("Usuario registrado:", usuario);
    return usuario;
}

registrarUsuario("Carlos", 20, "carlos@email.com");
