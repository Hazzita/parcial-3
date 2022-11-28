CREATE DATABASE extincion;

USE extincion;

CREATE TABLE fotografia(
	id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100),
    descripcion VARCHAR(500)
);

CREATE TABLE fotografia_lista(
	id INT AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(100)
);

CREATE TABLE animales(
	id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100),
    descripcion VARCHAR(500),
    imagen VARCHAR(500)
);

INSERT INTO	fotografia (titulo, descripcion) VALUES
	("Tipos de fotografias", "Se llama fotografía a una técnica y a una forma de arte que consisten en capturar imágenes empleando para ello la luz, proyectándola y fijándola en forma de imágenes sobre un medio sensible (físico o digital)."),
    ("", "La fotografía es el arte y la técnica de obtener imágenes duraderas debido a la acción de la luz.​ Es el proceso de proyectar imágenes, capturarlas y plasmarlas.");
	
INSERT INTO fotografia_lista (descripcion) VALUES 
	("Fotografía Publicitaria."),
    ("Fotografía de Arquitectura."),
    ("Fotografía de Autor."),
    ("Fotografía de Retrato."),
    ("Reportaje Fotográfico");
    
INSERT INTO animales (titulo, descripcion, imagen) VALUES
	("Animales en extincion", "Una especie en peligro de extinción es una especie biológica que está en peligro de desaparecer, ya sea global o regionalmente. Esto puede deberse a la pérdida de hábitat, contrabando de ejemplares silvestres o acción de especies invasoras..", "https://static.scientificamerican.com/espanol/cache/file/AF74ADFC-11A1-4BE8-8C6D050938F3CD40_source.jpg"),
    ("Reptiles", "Una de cada cinco especies estudiadas de cocodrilos, tortugas, lagartos, serpientes y tuataras (reptiles endémicos de las islas aledañas a Nueva Zelanda) está en riesgo de extinción. Los animales más amenazados son las tortugas y los cocodrilos: el 57,9 % y el 50 % de las especies están en peligro, respectivamente..", "https://estaticos.muyinteresante.es/uploads/images/gallery/5eb014125bafe80d70a6db24/curiosidades-reptiles_0.jpg"),
    ("Leones y Tigres", "En los últimos tiempos se ha reducido sustancialmente la población de grandes felinos. Estos animales han pasado de depredadores a presas. Presas porque están desapareciendo sus hábitats. Presas porque sus propias presas, imprescindibles para unos animales de alimentación 100% carnívora, también están desapareciendo. Y presas también porque a menudo son víctimas de los humanos, que los cazan furtivamente, ya sea por temor, placer o comercio ilegal..", "https://www.xlsemanal.com/wp-content/uploads/sites/3/2019/02/trafico-de-huesos-de-leon-en-china-2-1-768x506.jpg"),
    ("Animales Blancos", "Resulta bastante contradictorio comprobar cómo a pesar de que los tigres blancos son capaces de prosperar de forma salvaje cuando nacen ocasionalmente en sus hábitats naturales, cada vez son más los ejemplares de tigres blancos que son criados en cautiverio para garantizar así la presencia de esta sorprendente coloración en las generaciones futuras de estos tigres.", "https://www.ecoticias.com/wp-content/uploads/2022/01/99_8_rotador-1.jpg");