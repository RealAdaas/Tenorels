package com.example.adrien.tenorels;

public class Constant {

    /** MISC **/
    public static final String DEBUG_TAG = "JLE";

    /** BDD **/
    public static final String DATABASE_NAME = "playliste";
    public static final int DATABASE_VERSION = 1;

    public static final String PACKAGE_NAME = "com.example.adrien.tenorels";
    public static final String PATHNAME_DATABASE = String.format("data/data/%s/databases/%s", PACKAGE_NAME, DATABASE_NAME);


    /** Creation de la table Genre et insertion des donnees **/
    public static final String CREATE_TABLE_GENRE = "CREATE TABLE GENRE (id INTEGER PRIMARY KEY AUTOINCREMENT, nom TEXT)";
    public static final String INSERT_GENRE_VALUES = "INSERT INTO GENRE (nom) VALUES " +
            "('BigFlo et Oli')," +
            "('Fauve')," +
            "('Annees 80')," +
            "('Swing and Electro Swing')," +
            "('Trap Nation')";



    /** Creation de la table Chanson et insertion des donnees **/
    public static final String CREATE_TABLE_CHANSON = "CREATE TABLE CHANSON (id INTEGER PRIMARY KEY AUTOINCREMENT, nom TEXT, url TEXT, genre INTEGER, CONSTRAINT fk_id_genre FOREIGN KEY (genre) REFERENCES GENRE(id))";
    public static final String INSERT_CHANSON_VALUES = "INSERT INTO CHANSON (nom, url, genre) VALUES" +
            "('BigFlo et Oli - Plus Tard', 'https://www.youtube.com/watch?v=_UgsqtaXiwI', '0')," +
            "('BigFlo et Oli - Je suis', 'https://www.youtube.com/watch?v=8EyoKfM2Bv4', '0')," +
            "('BigFlo et Oli - Monsieur tout le monde', 'https://www.youtube.com/watch?v=ZFW-ET8fcMk', '0')," +
            "('BigFlo et Oli - Salope !', 'https://www.youtube.com/watch?v=-wGB2Pyrqkc', '0')," +
            "('BigFlo et Oli - Nous aussi 2', 'https://www.youtube.com/watch?v=wRFb5M2o6-k', '0')," +
            "('BigFlo et Oli - Dommage', 'https://www.youtube.com/watch?v=8AF-Sm8d8yk', '0')," +
            "('BigFlo et Oli - Demain', 'https://www.youtube.com/watch?v=d-VE9Kba3GY', '0')," +
            "('BigFlo et Oli - Papa ft Notre pere Fabian', 'https://www.youtube.com/watch?v=E5qps9FCyfY', '0')," +
            "('BigFlo et Oli - Freestyle du Dico', 'https://www.youtube.com/watch?v=fwKSENnZ7oM', '0')," +
            "('BigFlo et Oli - Gangsta', 'https://www.youtube.com/watch?v=NfRgi41xL_4', '0')," +
            "('BigFlo et Oli - Ca va trop vite', 'https://www.youtube.com/watch?v=vfE6Pgr_pAY', '0')," +

            "('Fauve - Voyou', 'https://www.youtube.com/watch?v=xcv0EN3TMZ0', '1')," +
            "('Fauve - Blizzard', 'https://www.youtube.com/watch?v=519_pOvP9xs', '1')," +
            "('Fauve - Les Hautes Lumieres', 'https://www.youtube.com/watch?v=wDxchoqHQbg', '1')," +
            "('Fauve - Infirmières', 'https://www.youtube.com/watch?v=RLmZhA7F9WU', '1')," +
            "('Fauve - Kané', 'https://www.youtube.com/watch?v=kb1Nu75l1vA', '1')," +
            "('Fauve - Rub A Dub', 'https://www.youtube.com/watch?v=XpkF_Wa6UXs', '1')," +
            "('Fauve - Nuits Fauves', 'https://www.youtube.com/watch?v=oHvQUGD2a0I', '1')," +
            "('Fauve - Lettre à Zoé', 'https://www.youtube.com/watch?v=u4xWTC1y1Z8', '1')," +
            "('Fauve - De Ceux', 'https://www.youtube.com/watch?v=JncOeX4CdlY', '1')," +
            "('Fauve - Jennifer', 'https://www.youtube.com/watch?v=aq8Djlg2SAI', '1')," +

            "('Début de soirée - Nuit de Folie', 'https://www.youtube.com/watch?v=yTzyJ7kDLL4','2'),"+
            "('A-ha - Take On Me', 'https://www.youtube.com/watch?v=djV11Xbc914','2')," +
            "('Cyndi Lauper - Girls Just Want Have fun', 'https://www.youtube.com/watch?v=PIb6AZdTr-A','2')," +
            "('Queen - I want to break free', 'https://www.youtube.com/watch?v=f4Mc-NYPHaQ','2')" +
            "('Eurythmics - Sweet Dreams', 'https://www.youtube.com/watch?v=qeMFqkcPYcg','2')," +
            "('Indochine - L aventurier', 'https://www.youtube.com/watch?v=M7X6oYg6iro','2')," +
            "('Rick Astley - Never Gonna Give You Up', 'https://www.youtube.com/watch?v=dQw4w9WgXcQ','2')," +
            "('Sabrina Salerno - Boys', 'https://www.youtube.com/watch?v=Kx1ePSOLEas','2')," +
            "('Micheal Jackson - Billie Jean', 'https://www.youtube.com/watch?v=Zi_XLOBDo_Y','2')," +
            "('Les Rita Mitsouko - Marcia Baila', 'https://www.youtube.com/watch?v=1zWlnzFXcKY','2')," +

            "('The Benny Goodman Orchestra - Sing Sing Sing', 'https://www.youtube.com/watch?v=fhyhP_5VfKM','3')," +
            "('Big Bad Voodoo Daddy - Jumpin' Jack ', 'https://www.youtube.com/watch?v=TEWuZ0QBvlo','3')," +
            "('Cissie Redgwick - Gimme That Swing', 'https://www.youtube.com/watch?v=FALYmqt-7TQ','3')," +
            "('DelaDap - Crazy Swing', 'https://www.youtube.com/watch?v=sFhVONZq5QM','3')," +
            "('DelaDap - Georgian Lesson', 'https://www.youtube.com/watch?v=aIq-kaft9aI','3')," +
            "('Tape Five - Pantaloons', 'https://www.youtube.com/watch?v=Mo9t5F91hVs','3')," +
            "('Caravan Palace - Lone Digger', 'https://www.youtube.com/watch?v=UbQgXeY_zi4','3')," +
            "('Parov Stelar - All Night', 'https://www.youtube.com/watch?v=_C7UgR_sIW0','3')," +
            "('Parov Stelar - Booty Swing', 'https://www.youtube.com/watch?v=Eco4z98nIQY','3')," +
            "('Jamie Berry (ft Octavia Rose) - Delight', 'https://www.youtube.com/watch?v=aH5aq4V0Ywk','3')," +
            "('Dunkelbunt (Ft Boban) - Cinnamon Girl ', 'https://www.youtube.com/watch?v=I1_BPn7TN1Q','3')," +

            "('Trap Nation - Neon', 'https://www.youtube.com/watch?v=DPgGDj9y8MQ','4')," +
            "('Trap Nation - Feel No pain', 'https://www.youtube.com/watch?v=s3Z4sWPSYio','4')," +
            "('Trap Nation - Upsilon', 'https://www.youtube.com/watch?v=ALeM-CtTB0k','4')," +
            "('Trap Nation - Everything is black ', 'https://www.youtube.com/watch?v=lcg6wekmCRA','4')," +
            "('Trap Nation - I'd love to Change the World', 'https://www.youtube.com/watch?v=5hEh9LiSzow','4')," +
            "('Trap Nation - Bad Karma ', 'https://www.youtube.com/watch?v=knfrxj0T5NY','4')," +
            "('Trap Nation - Until Dawn', 'https://www.youtube.com/watch?v=U8T6wocw4so','4')," +
            "('Trap Nation - Blue', 'https://www.youtube.com/watch?v=pVLmZMjxfjw','4')," +
            "('Trap Nation - Revolution', 'https://www.youtube.com/watch?v=ntLop32pYd0','4')," +
            "('Trap Nation - Rockstar', 'https://www.youtube.com/watch?v=gI3Zn9-tuq8','4')";






    /** Création d'attribut pour faire les requetes de la bdd **/
    public static final String TABLE_NAME_GENRE = "GENRE";
    public static final String TABLE_NAME_CHANSON = "CHANSON";
    public static final String COLUMN_NOM_TABLE_GENRE = "nom";
    public static final String COLUMN_NOM_TABLE_CHANSON = "nom";
    public static final String COLUMN_GENRES_TABLE_CHANSON = "genre";
    public static final String COLUMN_URL_TABLE_CHANSON = "url";






} /** fin de la class Constant **/
