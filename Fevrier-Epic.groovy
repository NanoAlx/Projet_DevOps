// Fevrier-Epic.groovy
def call() {
    pipeline {
        agent any
        stages {
            stage ('Fevrier') {
                steps {
                    script {
                        echo "Bienvenue au mois de Février - Epic"
                        echo "Avez-vous rendu votre espace plus agréable? Réponse: ${params.FEVRIER_ESPACE_AGREABLE}"
                    }
                }
            }
            // Ajoutez d'autres étapes pour le mois de février si nécessaire
        }
    }
}
