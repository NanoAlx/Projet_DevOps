// Janvier-Epic.groovy
def call() {
    pipeline {
        agent any
        stages {
            stage ('Janvier') {
                steps {
                    script {
                        echo "Bienvenue au mois de Janvier - Epic"
                        echo "Avez-vous rédigé un journal intime? Réponse: ${params.JANVIER_JOURNAL}"
                    }
                }
            }
            // Ajoutez d'autres étapes pour le mois de janvier si nécessaire
        }
    }
}
