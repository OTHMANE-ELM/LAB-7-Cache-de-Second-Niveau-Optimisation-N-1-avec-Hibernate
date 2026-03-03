package com.example.service;

import com.example.model.Auteur;
import com.example.model.Categorie;
import com.example.model.Livre;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

public class DataInitService {

    private final EntityManagerFactory emf;

    public DataInitService(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public void initData() {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();

            Categorie roman = new Categorie("Roman", "Œuvres de fiction narrative");
            Categorie scienceFiction = new Categorie("Science-Fiction", "Œuvres spéculatives basées sur des innovations scientifiques");
            Categorie fantasy = new Categorie("Fantasy", "Œuvres mettant en scène un univers imaginaire");
            Categorie policier = new Categorie("Policier", "Œuvres centrées sur la résolution d'une enquête");
            Categorie biographie = new Categorie("Biographie", "Récits de vie de personnalités");
            Categorie classique = new Categorie("Classique", "Grands textes de la littérature française");
            Categorie philosophie = new Categorie("Philosophie", "Œuvres de réflexion philosophique et existentielle");

            em.persist(roman);
            em.persist(scienceFiction);
            em.persist(fantasy);
            em.persist(policier);
            em.persist(biographie);
            em.persist(classique);
            em.persist(philosophie);

            Auteur hugo = new Auteur("Hugo", "Victor", "victor.hugo@litterature.fr");

            Livre lesMiserables = new Livre("Les Misérables", 1862, "9782253096344");
            lesMiserables.setResume("Jean Valjean, ancien forçat, cherche à se racheter dans une France du XIXe siècle marquée par la misère et l'injustice sociale.");
            lesMiserables.addCategorie(roman);
            lesMiserables.addCategorie(classique);

            Livre notredame = new Livre("Notre-Dame de Paris", 1831, "9782253096337");
            notredame.setResume("Quasimodo, sonneur de cloches difforme, voue un amour impossible à la belle Esmeralda dans le Paris médiéval.");
            notredame.addCategorie(roman);
            notredame.addCategorie(classique);

            Livre lHommeQuiRit = new Livre("L'Homme qui rit", 1869, "9782253007333");
            lHommeQuiRit.setResume("Gwynplaine, défiguré dans son enfance pour être condamné au rire éternel, découvre sa véritable identité noble.");
            lHommeQuiRit.addCategorie(roman);
            lHommeQuiRit.addCategorie(classique);

            hugo.addLivre(lesMiserables);
            hugo.addLivre(notredame);
            hugo.addLivre(lHommeQuiRit);

            Auteur zola = new Auteur("Zola", "Émile", "emile.zola@litterature.fr");

            Livre germinal = new Livre("Germinal", 1885, "9782070413119");
            germinal.setResume("Étienne Lantier descend dans les mines du Nord et prend conscience de la misère ouvrière, déclenchant une grève tragique.");
            germinal.addCategorie(roman);
            germinal.addCategorie(classique);

            Livre nana = new Livre("Nana", 1880, "9782070410118");
            nana.setResume("Nana, fille du peuple devenue courtisane célèbre, incarne la corruption et la décadence de la haute société du Second Empire.");
            nana.addCategorie(roman);
            nana.addCategorie(classique);

            Livre lAssommoir = new Livre("L'Assommoir", 1877, "9782070407729");
            lAssommoir.setResume("Gervaise Macquart, blanchisseuse courageuse, sombre peu à peu dans la misère et l'alcoolisme dans les faubourgs de Paris.");
            lAssommoir.addCategorie(roman);
            lAssommoir.addCategorie(classique);

            Livre laBeteHumaine = new Livre("La Bête humaine", 1890, "9782070413065");
            laBeteHumaine.setResume("Jacques Lantier, mécanicien de locomotive hanté par des pulsions meurtrières, est mêlé à un crime passionnel.");
            laBeteHumaine.addCategorie(roman);
            laBeteHumaine.addCategorie(classique);

            zola.addLivre(germinal);
            zola.addLivre(nana);
            zola.addLivre(lAssommoir);
            zola.addLivre(laBeteHumaine);

            Auteur flaubert = new Auteur("Flaubert", "Gustave", "gustave.flaubert@litterature.fr");

            Livre madameBovary = new Livre("Madame Bovary", 1857, "9782070413126");
            madameBovary.setResume("Emma Bovary, épouse d'un médecin de campagne, fuit l'ennui provincial dans des amours adultères qui la mènent à la ruine.");
            madameBovary.addCategorie(roman);
            madameBovary.addCategorie(classique);

            Livre lEducationSentimentale = new Livre("L'Éducation sentimentale", 1869, "9782070369393");
            lEducationSentimentale.setResume("Frédéric Moreau, jeune provincial monté à Paris, traverse les illusions de la jeunesse et les bouleversements politiques de 1848.");
            lEducationSentimentale.addCategorie(roman);
            lEducationSentimentale.addCategorie(classique);

            Livre salambo = new Livre("Salammbô", 1862, "9782070365951");
            salambo.setResume("Dans le Carthage antique, la prêtresse Salammbô est au cœur d'une guerre impitoyable entre Carthage et ses mercenaires révoltés.");
            salambo.addCategorie(roman);
            salambo.addCategorie(classique);

            flaubert.addLivre(madameBovary);
            flaubert.addLivre(lEducationSentimentale);
            flaubert.addLivre(salambo);

            Auteur camus = new Auteur("Camus", "Albert", "albert.camus@litterature.fr");

            Livre lEtranger = new Livre("L'Étranger", 1942, "9782070360024");
            lEtranger.setResume("Meursault, un homme indifférent au monde, commet un meurtre absurde sur une plage algérienne et affronte la justice avec une totale étrangeté.");
            lEtranger.addCategorie(roman);
            lEtranger.addCategorie(philosophie);

            Livre laPeste = new Livre("La Peste", 1947, "9782070360178");
            laPeste.setResume("Oran est frappée par une épidémie de peste. Le docteur Rieux et ses compagnons luttent contre le fléau dans une ville coupée du monde.");
            laPeste.addCategorie(roman);
            laPeste.addCategorie(philosophie);

            Livre laChute = new Livre("La Chute", 1956, "9782070365586");
            laChute.setResume("Jean-Baptiste Clamence, ancien avocat parisien, livre dans un bar d'Amsterdam une confession sur sa culpabilité et la duplicité humaine.");
            laChute.addCategorie(roman);
            laChute.addCategorie(philosophie);

            camus.addLivre(lEtranger);
            camus.addLivre(laPeste);
            camus.addLivre(laChute);

            Auteur proust = new Auteur("Proust", "Marcel", "marcel.proust@litterature.fr");

            Livre duCoteDeChezSwann = new Livre("Du côté de chez Swann", 1913, "9782070369218");
            duCoteDeChezSwann.setResume("Le narrateur plonge dans ses souvenirs d'enfance à Combray et relate l'amour obsessionnel de Swann pour Odette de Crécy.");
            duCoteDeChezSwann.addCategorie(roman);
            duCoteDeChezSwann.addCategorie(classique);

            Livre aLombreDesJeunesFillesEnFleurs = new Livre("À l'ombre des jeunes filles en fleurs", 1919, "9782070369225");
            aLombreDesJeunesFillesEnFleurs.setResume("Le narrateur découvre Balbec, rencontre Albertine et s'éveille aux premières émois amoureux dans la lumière de l'été.");
            aLombreDesJeunesFillesEnFleurs.addCategorie(roman);
            aLombreDesJeunesFillesEnFleurs.addCategorie(classique);

            Livre leTempsRetrouve = new Livre("Le Temps retrouvé", 1927, "9782070369249");
            leTempsRetrouve.setResume("Le narrateur comprend enfin le sens du temps perdu et trouve sa vocation d'écrivain.");
            leTempsRetrouve.addCategorie(roman);
            leTempsRetrouve.addCategorie(classique);

            proust.addLivre(duCoteDeChezSwann);
            proust.addLivre(aLombreDesJeunesFillesEnFleurs);
            proust.addLivre(leTempsRetrouve);

            Auteur verne = new Auteur("Verne", "Jules", "jules.verne@litterature.fr");

            Livre vingtMilleLieues = new Livre("Vingt mille lieues sous les mers", 1870, "9782070411795");
            vingtMilleLieues.setResume("Le professeur Aronnax et ses compagnons sont prisonniers du mystérieux capitaine Nemo à bord du Nautilus.");
            vingtMilleLieues.addCategorie(scienceFiction);
            vingtMilleLieues.addCategorie(roman);

            Livre voyageAuCentre = new Livre("Voyage au centre de la Terre", 1864, "9782070411801");
            voyageAuCentre.setResume("Le professeur Lidenbrock entraîne son neveu Axel dans une descente vertigineuse vers les entrailles de la Terre par un volcan islandais.");
            voyageAuCentre.addCategorie(scienceFiction);
            voyageAuCentre.addCategorie(roman);

            Livre leTourDuMonde = new Livre("Le Tour du monde en quatre-vingts jours", 1872, "9782070411818");
            leTourDuMonde.setResume("Phileas Fogg parie qu'il peut faire le tour du monde en 80 jours et entreprend avec son valet Passepartout un périple haletant.");
            leTourDuMonde.addCategorie(roman);
            leTourDuMonde.addCategorie(classique);

            Livre michelStrogoff = new Livre("Michel Strogoff", 1876, "9782070411825");
            michelStrogoff.setResume("Michel Strogoff, courrier du tsar, doit traverser la Sibérie en guerre pour porter un message vital, affrontant trahisons et épreuves.");
            michelStrogoff.addCategorie(roman);
            michelStrogoff.addCategorie(classique);

            verne.addLivre(vingtMilleLieues);
            verne.addLivre(voyageAuCentre);
            verne.addLivre(leTourDuMonde);
            verne.addLivre(michelStrogoff);

            Auteur stendhal = new Auteur("Stendhal", "Henri Beyle dit", "stendhal@litterature.fr");

            Livre leRougeEtLeNoir = new Livre("Le Rouge et le Noir", 1830, "9782070362479");
            leRougeEtLeNoir.setResume("Julien Sorel, fils de charpentier ambitieux, gravit les échelons de la société par la séduction et l'intelligence, avant de tomber tragiquement.");
            leRougeEtLeNoir.addCategorie(roman);
            leRougeEtLeNoir.addCategorie(classique);

            Livre laChartreuseDeParme = new Livre("La Chartreuse de Parme", 1839, "9782070369812");
            laChartreuseDeParme.setResume("Fabrice del Dongo, jeune idéaliste italien, traverse guerres, amours et intrigues de cour dans l'Italie napoléonienne.");
            laChartreuseDeParme.addCategorie(roman);
            laChartreuseDeParme.addCategorie(classique);

            stendhal.addLivre(leRougeEtLeNoir);
            stendhal.addLivre(laChartreuseDeParme);

            em.persist(hugo);
            em.persist(zola);
            em.persist(flaubert);
            em.persist(camus);
            em.persist(proust);
            em.persist(verne);
            em.persist(stendhal);

            em.getTransaction().commit();
            System.out.println("Données initialisées avec succès !");

        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public List<Auteur> getAuteurs() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT a FROM Auteur a", Auteur.class).getResultList();
        } finally {
            em.close();
        }
    }

    public List<Categorie> getCategories() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT c FROM Categorie c", Categorie.class).getResultList();
        } finally {
            em.close();
        }
    }
}