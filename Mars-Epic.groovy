// Mars-Epic.groovy
def call() {
    pipeline {
        agent any
        stages {
            stage ('Mars') {
                steps {
                    script {
                        echo "Bienvenue au mois de Mars - Epic"
                        echo "Avez-vous bien mangé? Réponse: ${params.MARS_MANGER}"
                        echo "Avez-vous fait de l'exercice? Réponse: ${params.MARS_EXERCICE}"
                        echo "Avez-vous arrêté de fumer? Réponse: ${params.MARS_FUMER}"
                        echo "Avez-vous pris soin de vous? Réponse: ${params.MARS_SOIN_DE_SOI}"
                    }
                }
            }
            // Ajoutez d'autres étapes pour le mois de mars si nécessaire
        }
    }
}