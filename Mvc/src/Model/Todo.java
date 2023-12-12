package Model;

public class Todo {
     // Crear instancias de las clases relacionadas con la manipulación de candidatos
     Actualizar actualizador = new Actualizar();
     Eliminar eliminador = new Eliminar();
     Buscar buscador = new Buscar();
     Listar listador = new Listar();
     Votar votador = new Votar();
     Insertar insertador = new Insertar();
     


     // Llamar a los métodos según sea necesario
     actualizador.actualizarCandidato(/* parámetros si es necesario */);
     eliminador.eliminarCandidato(/* parámetros si es necesario */);
     buscador.buscarCandidato(/* parámetros si es necesario */);
     listador.listarCandidatos();
}
