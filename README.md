on s'est servi de 2 interface IDAO et IMetier


![1](https://github.com/solitairex/Uni-JEE-Pratique1/assets/149163002/fde8f39c-59e8-4477-9f05-2c0f64b95398)



![2](https://github.com/solitairex/Uni-JEE-Pratique1/assets/149163002/1070800d-4933-4959-817c-d8e79d224058)


qui contiennent une methode qu'on s'est alors servi sur des classes qui retournent des valeurs d'ou DaoImpl retourne une valeur aléatoire et ImetierImpl qui  utilise un objet de type DAO , lui donne une valeur et ensuite l'injecte avec la methode setDao


![3](https://github.com/solitairex/Uni-JEE-Pratique1/assets/149163002/73ba4a9d-8f5d-4e21-9766-1f3048f3ee69)


![4](https://github.com/solitairex/Uni-JEE-Pratique1/assets/149163002/bda7be0c-d54c-4beb-80f6-36003565edf8)


La classe Presentation contient la methode Main qui sert a executer notre programme


la classe Pres2 , qui a une methode main qui lit le fichier config.txt afin de creer des instance des noms de classes contenues dans le fichier texte


![5](https://github.com/solitairex/Uni-JEE-Pratique1/assets/149163002/1f64626b-271c-403e-a6d3-e385ec118291)


![6](https://github.com/solitairex/Uni-JEE-Pratique1/assets/149163002/3bab2c3c-c05c-497a-8cdf-4df5f5c110c9)


config.txt:


![config](https://github.com/solitairex/Uni-JEE-Pratique1/assets/149163002/df1ea108-6f59-4f87-a635-89fec53ff1a6)


la difference entre Presentation et Pres 2 est que Pres2 est beaucoup plus flexible car on peut configurer dynamiquement  les classes a partier d'un fichier texte

