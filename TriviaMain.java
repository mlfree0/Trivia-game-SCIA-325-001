import java.util.*;

public class TriviaMain
{
	static ArrayList<Question> questions = new ArrayList<Question>();

	public static void main(String[] args)
	{
		int wager;
		int score = 0;
		boolean correct;
		String selectedCategory;
		
		Question q1 = new Question("In what year did Star Wars release?", "Movies", "1977", "1980", "1975", "1982");
		questions.add(q1);
		Question q2 = new Question("What team won Superbowl 60?", "Sports", "Seattle Seahawks", "Kansas City Chiefs", "New England Patriots", "Denver Broncos");
		questions.add(q2);
		Question q3 = new Question("How many $500 bills are included in a modern edition of Monopoly?", "Board Games", "40", "20", "30", "25");
		questions.add(q3);
		Question q4 = new Question("In what year did the American Revolution end?", "American History", "1783", "1778", "1780", "1786");
		questions.add(q4);
		Question q5 = new Question("How many dice are used in a game of Yatzee?", "Board Games", "5 Dice", "6 Dice", "10 Dice", "3 Dice");
		questions.add(q5);
		Question q6 = new Question("What videogame contains the famous \"BLJ\" glitch?", "Videogames", "Super Mario 64", "The Legend of Zelda: Ocarina of Time", "Donkey Kong 64", "Crash Bandicoot");
		questions.add(q6);
		Question q7 = new Question("What is the only planet in our solar system to rotate clockwise on its axis?", "Astronomy", "Venus", "Mercury", "Jupiter", "Neptune");
		questions.add(q7);
		Question q8 = new Question("How many states does the Appalachian Trail cross?", "Geography", "14", "8", "10", "16");
		questions.add(q8);
		Question q9 = new Question("M&M’S Fruit Chews would eventually become what popular candy?", "Food", "Starburst", "Skittles", "Hi-Chew", "Dots");
		questions.add(q9);
		Question q10 = new Question("What guitarist performed on the Michael Jackson song \"Beat it\"?", "Music", "Eddie Van Halen", "Jimmy Page", "Randy Rhoades", "Stevie Ray Vaughn");
		questions.add(q10);
		Question q11 = new Question("Which of these Sci-Fi movies did Steven Spielburg not help create?", "Movies", "2001: A Space Odessey", "Back to the Future", "Ready Player One", "E.T.");
		questions.add(q11);
		Question q12 = new Question("What’s the diameter of a basketball hoop in inches?", "Sports", "18 inches", "14 inches", "20 inches", "17 inches");
		questions.add(q12);
		Question q13 = new Question("In what year was the first Scrabble board game sold?", "Board Games", "1948", "1961", "1954", "1966");
		questions.add(q13);
		Question q14 = new Question("Who was the 23rd President of the United States?", "American History", "Benjamin Harrison", "James Buchanan", "Theodore Roosevelt", "Woodrow Wilson");
		questions.add(q14);
		Question q15 = new Question("How many herbs and spices are in Colonel Sanders’ original KFC recipe?", "Food", "11", "5", "8", "13");
		questions.add(q15);
		Question q16 = new Question("Which videogame series features a half demon who wields a sword and twin pistols?", "Videogames", "Devil May Cry", "Resident Evil", "Kid Icarus", "Persona");
		questions.add(q16);
		Question q17 = new Question("What galaxy is the closest to the Milky Way?", "Astronomy", "Andromeda Galaxy", "Black Eye Galaxy", "Helix Galaxy", "Southern Pinwheel Galaxy");
		questions.add(q17);
		Question q18 = new Question("Which of these countries is landlocked?", "Geography", "Austria", "Germany", "Bulgeria", "Latvia");
		questions.add(q18);
		Question q19 = new Question("What was the first pizza restaurant chain to deliver?", "Food", "Domino's", "Pizza Hut", "Fox's Den", "Little Caeser's");
		questions.add(q19);
		Question q20 = new Question("Which of these bands has a one-armed drummer?", "Music", "Def Leppard", "Metallica", "Van Halen", "Whitesnake");
		questions.add(q20);
		Question q21 = new Question("Which of these mythical gods is not from Greece?", "Mythology", "Jupiter", "Ares", "Hephaestus", "Athena");
		questions.add(q21);
		Question q22 = new Question("Who is the Greek god of Wine?", "Mythology", "Dionysus", "Hermes", "Zeus", "Apollo");
		questions.add(q22);
		Question q23 = new Question("Who is the Greek god of the dead?", "Mythology", "Thanatos", "Hades", "Ares", "Artemis");
		questions.add(q23);
		Question q24 = new Question("Which demigod killed Medusa?", "Mythology", "Perseus", "Hercules", "Odysseus", "Achilles");
		questions.add(q24);
		Question q25 = new Question("What Greek god kept Odysseus from returning home in The Odyssey?", "Mythology", "Poseidon", "Hades", "Zeus", "Aphrodite");
		questions.add(q25);
		Question q26 = new Question("What was Heath Ledger's last role before he died?", "Movies", "The Joker", "Patrick Verona", "William Thatcher", "Ennis Del Mar");
		questions.add(q26);
		Question q27 = new Question("Who was the first fully CGI character in a movie?", "Movies", "Jar Jar Binks", "The Troll in Harry Potter", "Chewbacca", "Jabba the Hutt");
		questions.add(q27);
		Question q28 = new Question("What string of numbers and letters is hidden in each Pixar movie?", "Movies", "A113", "B93G", "P1X4R", "00PAS1");
		questions.add(q28);
		Question q29 = new Question("What Disneyland ride was later turned into a movie franchise?", "Movies", "Pirates of the Caribbean", "Haunted Mansion", "It's a Small World", "Alien Encounter");
		questions.add(q29);
		Question q30 = new Question("Who was going to be the main villain of the cancelled Spiderman 4 movie?", "Movies", "The Vulture", "Kraven the Hunter", "Hobgoblin", "Electro");
		questions.add(q30);
		Question q31 = new Question("What platform was the first Kirby game playable on?", "Videogames", "Gameboy", "Gameboy Color", "NES", "SNES");
		questions.add(q31);
		Question q32 = new Question("In what year did the first DOOM game release?", "Videogames", "1993", "1990", "1997", "1988");
		questions.add(q32);
		Question q33 = new Question("What is the best selling Videogame of all time?", "Videogames", "Minecraft", "Grand Theft Auto V", "Wii Sports", "Super Mario Bros.");
		questions.add(q33);
		Question q34 = new Question("Which game in The Legend of Zelda series was released to commemorate the series' 25th anniversary?", "Videogames", "Skyward Sword", "Twilight Princess", "Triforce Heroes", "Breath of the Wild");
		questions.add(q34);
		Question q35 = new Question("What soda brand made a videogame to attempt to promote their soda?", "Videogames", "Pepsi", "Coke a Cola", "Dr. Pepper", "Crush Orange");
		questions.add(q35);
		Question q36 = new Question("Which of these board games is not a player vs. player game?", "Board Games", "Pandemic", "Santorini", "Trouble", "Exploding Kittens");
		questions.add(q36);
		Question q37 = new Question("Which of these is not a player color in the base version of Catan?", "Board Games", "Green", "Orange", "White", "Red");
		questions.add(q37);
		Question q38 = new Question("Which toy manufacturer makes the game Sorry?", "Board Games", "Hasbro", "Parker Brothers", "Mattel", "Spin Master");
		questions.add(q38);
		Question q39 = new Question("How many rooms are on a traditional board for the game Clue?", "Board Games", "9", "7", "11", "10");
		questions.add(q39);
		Question q40 = new Question("How many pawns are in a chess set?", "Board Games", "16", "18", "14", "20");
		questions.add(q40);
		Question q41 = new Question("How many seasons of the Big Bang Theory are there?", "TV Shows", "12", "10", "8", "5");
		questions.add(q41);
		Question q42 = new Question("Who plays the main character in House M.D.?", "TV Shows", "Hugh Laurie", "Matthew Perry", "Robert Sean Leonard", "Jim Parsons");
		questions.add(q42);
		Question q43 = new Question("Which character died in season 3 of M*A*S*H?", "TV Shows", "Henry Blake", "Hawkeye", "Radar", "Klinger");
		questions.add(q43);
		Question q44 = new Question("In what state does South Park take place?", "TV Shows", "Colorado", "Montana", "Idaho", "California");
		questions.add(q44);
		Question q45 = new Question("What is Walter White's job in Breaking Bad?", "TV Shows", "Chemistry teacher", "Bank Manager", "Engineer", "Architect");
		questions.add(q45);
		Question q46 = new Question("Which of these kids shows is no longer running?", "TV Shows", "Arthur", "Spongebob Squarepants", "Pokemon", "Lego Ninjago");
		questions.add(q46);
		Question q47 = new Question("What was the first Netflix Original Series?", "TV Shows", "House of Cards", "Stranger Things", "Outer Banks", "The Witcher");
		questions.add(q47);
		Question q48 = new Question("What is the longest running gameshow?", "TV Shows", "The Price is Right", "Wheel of Fortune", "Jeopardy", "Who Wants to be a Millionaire?");
		questions.add(q48);
		Question q49 = new Question("Who was the first person to win Survivor?", "TV Shows", "Richard Hatch", "\"Boston\" Rob Mariano", "Parvati Shallow", "Sandra Diaz-Twine");
		questions.add(q49);
		Question q50 = new Question("Out of these TV shows, which one's pilot episode is considered lost media?", "TV Shows", "Johnny Bravo", "Family Guy", "Dora the Explorer", "Phineas and Ferb");
		questions.add(q50);
		Question q51 = new Question("What was the first ever Hot Wheels car to be produced?", "Toys", "Custom Camaro", "Ford J-Car", "Custom Corvette", "Deora");
		questions.add(q51);
		Question q52 = new Question("LEGO is a toy company from what country?", "Toys", "Denmark", "Sweden", "America", "France");
		questions.add(q52);
		Question q53 = new Question("Which of these toys is a marble that opens into the shape of a monster?", "Toys", "Bakugan", "Beyblade", "Monsuno", "Tech Deck");
		questions.add(q53);
		Question q54 = new Question("What was the first toy line of action figures?", "Toys", "G.I. Joe", "Star Wars", "He-Man", "DC Super Heroes");
		questions.add(q54);
		Question q55 = new Question("Which of these toy lines did not have a corresponding TV show?", "Toys", "Stretch Armstrong", "Power Rangers", "Bakugan", "Transformers");
		questions.add(q55);
		Question q56 = new Question("Which of these single LEGO pieces sold for $18,001?", "Toys", "14-karat gold Bionicle Mask", "Mr. Gold's minifigure head", "Star Wars molded Rancor", "LEGO logo brick given to employees");
		questions.add(q56);
		Question q57 = new Question("What did Nerf make before making Nerf Blasters?", "Toys", "Foam balls", "Super Soakers", "T-shirts", "Factory parts");
		questions.add(q57);
		Question q58 = new Question("What toy was \"discovered\" by WWII scientists?", "Toys", "Silly Putty", "Bouncy Balls", "Nerf Guns", "Slinky");
		questions.add(q58);
		Question q59 = new Question(" In 1999, the National Security Agency banned what toy from its premises over concerns that the toy might be able to record and repeat classified information?", "Toys", "Furby", "Karaoke machine", "Gameboy Camera", "Yak Bak");
		questions.add(q59);
		Question q60 = new Question("In what state did the first Toys 'R' Us open?", "Toys", "Maryland", "New York", "North Carolina", "Nevada");
		questions.add(q60);
		Question q61 = new Question("On what day did the Japanese attack Pearl Harbor?", "American History", "December 7th, 1941", "November 11th, 1945", "September 1st, 1939", "February 5th, 1938");
		questions.add(q61);
		Question q62 = new Question("What war has the highest number of American casualties?", "American History", "Civil War", "Revolutionary War", "World War 2", "Vietnam War");
		questions.add(q62);
		Question q63 = new Question("Where was Martin Luther King Jr. born?", "American History", "Atlanta, Georgia", "Jackson, Mississippi", "Baltimore, Maryland", "Orlando, Florida");
		questions.add(q63);
		Question q64 = new Question("In what year did the Gold Rush start?", "American History", "1848", "1856", "1854", "1866");
		questions.add(q64);
		Question q65 = new Question("Who was the first president to be impeached", "American History", "Andrew Johnson", "Andrew Jackson", "Millard Filmore", "James Buchanan");
		questions.add(q65);
		Question q66 = new Question("What amendment to the US Constitution gave women the right to vote?", "American History", "19th Amendment", "20th Amendment", "17th Amendment", "15th Amendment");
		questions.add(q66);
		Question q67 = new Question("How many Federalist Papers did Alexander Hamilton write?", "American History", "51", "28", "32", "43");
		questions.add(q67);
		Question q68 = new Question("In what year did humans first walk on the moon?", "American History", "1969", "1965", "1971", "1970");
		questions.add(q68);
		Question q69 = new Question("How long was the first Thanksgiving Celebration?", "American History", "3 days", "1 day", "5 days", "13 days");
		questions.add(q69);
		Question q70 = new Question("In what year was Osama bin Laden killed?", "American History", "2011", "2001", "2004", "2009");
		questions.add(q70);
		Question q71 = new Question("Who sings the song \"Please Please Please\"?", "Music", "Sabrina Carpenter", "Taylor Swift", "Ke$ha", "Olivia Rodrigo");
		questions.add(q71);
		Question q72 = new Question("What is Metallica's fourth studio album?", "Music", "...And Justice for All", "Master of Puppets", "Loaded", "Ride the Lightning");
		questions.add(q72);
		Question q73 = new Question("What is the name of Charli XCX's Brat remix album?", "Music", "Brat and it's Completely Different but also Still Brat", "Brat 2", "Bratty", "Brat but Better");
		questions.add(q73);
		Question q74 = new Question("Which of these groups is not in the Rock and Roll Hall of Fame?", "Music", "Scorpions", "ABBA", "Black Sabbath", "KISS");
		questions.add(q74);
		Question q75 = new Question("What artist performed at the Eras Tour?", "Music", "Taylor Swift", "Ariane Grande", "Lady Gaga", "Diana Ross");
		questions.add(q75);
		Question q76 = new Question("Which album is Twenty One Pilot's most streamed song, \"Stressed Out\" on?", "Music", "Blurryface", "Trench", "Breach", "Vessel");
		questions.add(q76);
		Question q77 = new Question("Which artist performed at the Super Bowl halftime show in 2006?", "Music", "The Rolling Stones", "The Who", "Paul McCartney", "Aerosmith");
		questions.add(q77);
		Question q78 = new Question("What year is the title of a song by the group Bowling For Soup?", "Music", "1985", "1969", "1975", "1991");
		questions.add(q78);
		Question q79 = new Question("Which classical composer wrote \"Moonlight Sonata\"?", "Music", "Ludwig von Beethoven", "Wolfgang Amadeus Mozart", "Antonio Vilvaldi", "John Williams");
		questions.add(q79);
		Question q80 = new Question("How many studio ablums did the band My Chemical Romance produce?", "Music", "4", "2", "7", "3");
		questions.add(q80);
		Question q81 = new Question("What is the highest grossing R-Rated movie?", "Movies", "Deadpool & Wolverine", "Oppenheimer", "Saving Private Ryan", "It");
		questions.add(q81);
		Question q82 = new Question("Which of these directors has never won and Oscar?", "Movies", "Stanley Kubrick", "George Lucas", "Christopher Nolan", "Ron Howard");
		questions.add(q82);
		Question q83 = new Question("Which of these Marvel movies does not feature a cameo from Stan Lee?", "Movies", "Ghost Rider", "The Avengers", "Spiderman", "The Fantastic Four");
		questions.add(q83);
		Question q84 = new Question("Which famous actor played the characters of Dracula, Count Dooku, and Saruman the White?", "Movies", "Sir Christopher Lee", "Sir Alec Guiness", "Boris Karloff", "Sir Ian Mckellen");
		questions.add(q84);
		Question q85 = new Question("What was Dreamworks' sixth animated film?", "Movies", "Shrek", "Prince of Egypt", "Antz", "Kung Fu Panda");
		questions.add(q85);
		Question q86 = new Question("Who created the character Super Mario?", "Videogames", "Shigeru Miyamoto", "Masahiro Sakura", "Charles Martinet", "Satoru Iwata");
		questions.add(q86);
		Question q87 = new Question("Which Call of Duty game released in 2012?", "Videogames", "Call of Duty: Black Ops II", "Call of Duty: Modern Warfare", "Call of Duty: Black Ops", "Call of Duty: Modern Warfare 2");
		questions.add(q87);
		Question q88 = new Question("The Fallout Series is developed and published by which game studio?", "Videogames", "Bethedsa", "Rock Star", "Activision", "Capcom");
		questions.add(q88);
		Question q89 = new Question("What popular game was packaged with the Wii when it released in 2006?", "Videogames", "Wii Sports", "Wii Play", "Super Mario Galaxy", "Mario Kart Wii");
		questions.add(q89);
		Question q90 = new Question("What iconic fighting game series features the quote \"Get over here!\"?", "Videogames", "Mortal Kombat", "Street Fighter", "Tekken", "Super Smash Bros.");
		questions.add(q90);
		Question q91 = new Question("What term is used to describe the zone that habitable planets reside in?", "Astronomy", "Goldy Locks Zone", "Safe Zone", "Green Zone", "Lightspeed Zone");
		questions.add(q91);
		Question q92 = new Question("How many moons does Saturn currently have?", "Astronomy", "285", "166", "202", "197");
		questions.add(q92);
		Question q93 = new Question("What color is the sun in our solar system?", "Astronomy", "White", "Orange", "Yellow", "Red");
		questions.add(q93);
		Question q94 = new Question("In what mission did humans first land on the moon?", "Astronomy", "Apollo 11", "Apollo 8", "Apollo 13", "Pioneer 1");
		questions.add(q94);
		Question q95 = new Question("How many days is a year on Mars?", "Astronomy", "687 days", "365 days", "421 days", "298 days");
		questions.add(q95);
		Question q96 = new Question("Florida is an example of which geographic feature?", "Geography", "Peninsula", "Strait", "Plateau", "Basin");
		questions.add(q96);
		Question q97 = new Question("Which country has the largest population in the world?", "Geography", "China", "United States of America", "Russia", "Brazil");
		questions.add(q97);
		Question q98 = new Question("What is the coldest place on earth?", "Geography", "Antarctica", "The Arctic", "Alaska", "Mount Everest");
		questions.add(q98);
		Question q99 = new Question("What body of water is between Ukraine and Turkey?", "Geography", "The Black Sea", "The Mediterranean Sea", "The Bay of Biscay", "The Adriatic Sea");
		questions.add(q99);
		Question q100 = new Question("How many colors are on the South African Flag?", "Geography", "6", "3", "2", "5");
		questions.add(q100);
		Question q101 = new Question("How many points is a touchdown worth in American Football?", "Sports", "6 Points", "7 Points", "5 Points", "3 Points");
		questions.add(q101);
		Question q102 = new Question("Who is the youngest Basketball player to score 10,000 points?", "Sports", "Lebron James", "Michael Jordan", "Larry Bird", "Shaquille O'Neal");
		questions.add(q102);
		Question q103 = new Question("What base is stolen the most in Baseball?", "Sports", "2nd Base", "1st Base", "3rd Base", "Home Plate");
		questions.add(q103);
		Question q104 = new Question("How many teams has the Soccer player Lionel Messi played for?", "Sports", "3 Teams", "2 Teams", "5 Teams", "4 Teams");
		questions.add(q104);
		Question q105 = new Question("Which NHL team won the Stanely Cup in 2015?", "Sports", "Chicago Blackhawks", "Pittsburgh Penguins", "Boston Bruins", "Vancouver Canucks");
		questions.add(q105);
		Question q106 = new Question("What fast food chain has the most locations in the United States?", "Food", "Subway", "McDonald's", "Burger King", "Taco Bell");
		questions.add(q106);
		Question q107 = new Question("When was the color blue added to M&Ms?", "Food", "1995", "1958", "1966", "1978");
		questions.add(q107);
		Question q108 = new Question("Which of these candies has a roller coaster named after it at Hershey Park?", "Food", "Jolly Rancher", "Reese's Cup", "Hershey Kiss", "Twizzler");
		questions.add(q108);
		Question q109 = new Question("What was the original price of a Reese's Cup?", "Food", "1 Penny", "1 Nickel", "1 Dollar", "2 Dimes");
		questions.add(q109);
		Question q110 = new Question("Where were Spagetti noodles invented?", "Food", "The Middle East", "Italy", "France", "China");
		questions.add(q110);
		Question q111 = new Question("What country has the largest population of Tigers?", "Animals", "India", "South Africa", "Turkey", "Pakistan");
		questions.add(q111);
		Question q112 = new Question("How many legs does a lobster have?", "Animals", "10 Legs", "12 Legs", "8 Legs", "16 Legs");
		questions.add(q112);
		Question q113 = new Question("What mammals have the thickest fur?", "Animals", "Sea Otters", "Polar Bears", "Bison", "Chincilla");
		questions.add(q113);
		Question q114 = new Question("In what U.S. state are Black Widows not found in?", "Animals", "Alaska", "Hawaii", "Montana", "North Dakota");
		questions.add(q114);
		Question q115 = new Question("What species of fish breed for life?", "Animals", "Angelfish", "Clown Fish", "Blue Tang", "Pufferfish");
		questions.add(q115);
		Question q116 = new Question("How many teeth does a Great White Shark have?", "Animals", "300 Teeth", "200 Teeth", "250 Teeth", "450 Teeth");
		questions.add(q116);
		Question q117 = new Question("What animal lays the largest eggs?", "Animals", "Ostrich", "Great White Shark", "Flamingo", "Emu");
		questions.add(q117);
		Question q118 = new Question("What is the heaviest venomous snake found in the United States?", "Animals", "Eastern Diamondback Rattlesnake", "Timber Rattlesnake", "Copperhead", "Mojave Desert Sidewinder");
		questions.add(q118);
		Question q119 = new Question("Which insect can turn its head 180 degrees?", "Animals", "Praying Mantis", "Centipede", "Snail", "Grasshopper");
		questions.add(q119);
		Question q120 = new Question("Which of these big cats can't roar?", "Animals", "Cheetah", "Lion", "Tiger", "Jaquars");
		questions.add(q120);
		Question q121 = new Question("Which port is the Telnet port?", "Computer Science", "Port 23", "Port 80", "Port 50", "Port 74");
		questions.add(q121);
		Question q122 = new Question("What is the fourth layer of the Networking OSI Model?", "Computer Science", "Layer 4", "Layer 2", "Layer 3", "Layer 5");
		questions.add(q122);
		Question q123 = new Question("Which progamming language was the first to be widely known and used?", "Computer Science", "FORTRAN", "Java", "A", "FLOW-MATIC");
		questions.add(q123);
		Question q124 = new Question("Who technically owns Java?", "Computer Science", "Oracle", "Microsoft", "Linux", "Java Corporation");
		questions.add(q124);
		Question q125 = new Question("Which Linux distribution is commonly used by cybersecurity specialists?", "Computer Science", "Kali", "Ubuntu", "Debian", "Red Hat");
		questions.add(q125);
		Question q126 = new Question("When did the first iPhone release?", "Computer Science", "2007", "2004", "2010", "2005");
		questions.add(q126);
		Question q127 = new Question("What kind of cyber attack involves overloading servers with excessive network traffic?", "Computer Science", "DoS", "Backdoor", "SPAM", "Ransomware");
		questions.add(q127);
		Question q128 = new Question("Which piece of computer hardware is responsible for temporary storage?", "Computer Science", "RAM", "Hard Drive", "CPU", "GPU");
		questions.add(q128);
		Question q129 = new Question("What does HTTP stand for?", "Computer Science", "HyperText Transfer Protocal", "HyperText Transport Protocol", "Header Transport Text Protocol", "Header Timeout Test Protocol");
		questions.add(q129);
		Question q130 = new Question("What is the Python variable type for numbers with a decimal place called?", "Computer Science", "Float", "Double", "Dec", "Point");
		questions.add(q130);
		Question q131 = new Question("How many gold medals did the United States win at the 2016 Summer Olympic Games?", "Sports", "46 Gold Medals", "37 Gold Medals", "24 Gold Medals", "32 Gold Medals");
		questions.add(q131);
		Question q132 = new Question("Who was originally going to play Marty McFly in \"Back to the Future\"?", "Movies", "Eric Stoltz", "Patrick Swayze", "Tom Cruise", "Mark Hamill");
		questions.add(q132);
		Question q133 = new Question("Which of these fruits is not a berry?", "Food", "Strawberry", "Cranberry", "Grape", "Tomato");
		questions.add(q133);
		Question q134 = new Question("What was the first game in the Toys-to-Life genre of videogames?", "Videogames", "Funkeys", "Skylanders", "Disney Infinity", "LEGO Dimensions");
		questions.add(q134);
		Question q135 = new Question("How many kids did the \"Brady Bunch\" have?", "TV Shows", "6 Kids", "5 Kids", "8 Kids", "10 Kids");
		questions.add(q135);
		Question q136 = new Question("What toy was recalled in 1998 because the battery units were overheating?", "Toys", "Power Wheels", "Furby", "Buzz Lightyear", "Bop It");
		questions.add(q136);
		Question q137 = new Question("Which planet in our solar system has the largest ocean?", "Astronomy", "Jupiter", "Neptune", "Earth", "Saturn");
		questions.add(q137);
		Question q138 = new Question("What was the only thing left in Pandora's box when it was opened?", "Mythology", "Hope", "Famine", "Joy", "Strife");
		questions.add(q138);
		Question q139 = new Question("Which of these things is Artemis not the goddess of?", "Mythology", "The Moon", "Hunting", "Transitions", "Wild Animals");
		questions.add(q139);
		Question q140 = new Question("Which of these binary strings is equal to 27 in decimal?", "Computer Science", "00011011", "00011000", "00010111", "00100101");
		questions.add(q140);
		Question q141 = new Question("Which of these bladed weapons was designed to have superior reach and power?", "Weapons", "Scottish Claymore", "Battle Axe", "Flail", "Morningstar");
		questions.add(q141);
		Question q142 = new Question("Which of these weapons can hit with the force of a bullet?", "Weapons", "Nunchucks", "Flail", "Javelin", "Bow and Arrow");
		questions.add(q142);
		Question q143 = new Question("Why were Kali Sticks invented?", "Weapons", "Ban on Bladed Weapons", "Lack of Materials", "Made as a Training Tool", "Used by Law Enforcement");
		questions.add(q143);
		Question q144 = new Question("When was the first rocket launcher invented?", "Weapons", "1380", "1540", "1940", "1870");
		questions.add(q144);
		Question q145 = new Question("What type of knife was invented to combat weapons with a long reach?", "Weapons", "Deer Horn Knife", "Kukri", "Machete", "Kunai");
		questions.add(q145);
		Question q146 = new Question("Which of these weapons don't have Chinese origins?", "Weapons", "War Hammer", "Hook Swords", "Butterfly Swords", "Halberd");
		questions.add(q146);
		Question q147 = new Question("What a Falx originally used for?", "Weapons", "Cutting Wheat", "Chopping Wood", "Home Defense", "Skinning Animals");
		questions.add(q147);
		Question q148 = new Question("What country invented the AK-47?", "Weapons", "Soviet Union", "United States", "Germany", "North Korea");
		questions.add(q148);
		Question q149 = new Question("Who requested the creation of the FN P90 Submachine Gun?", "Weapons", "NATO", "United Nations", "United States Government", "Soviet Union");
		questions.add(q149);
		Question q150 = new Question("When were drones first used in warfare?", "Weapons", "World War One", "World War Two", "Persian Gulf War", "War on Terror");
		questions.add(q150);
		
		
		System.out.println("Welcome to trivia game!\n");
		
		for(int questionCounter = 0; questionCounter < 21; questionCounter++)
		{
			System.out.println("Please select from the following categories.");

			Question select1 = new Question();
			select1 = selectQuestions();
			Question select2 = new Question();
			select2 = selectQuestions();
			Question select3 = new Question();
			select3 = selectQuestions();

			System.out.println(select1.getCategory());
			System.out.println(select2.getCategory());
			System.out.println(select3.getCategory());

			Scanner input = new Scanner(System.in);
			selectedCategory = input.nextLine();

			System.out.println("Place your wager. You can wager points from 10-100 that are multiples of 10");
			wager = input.nextInt();
			//Verifying that the wager is valid
			if(wager > 100 || wager % 10 != 0)
			{
					System.out.println("Please select an appropriate wager");
					wager = input.nextInt();
			}

			if(selectedCategory.equalsIgnoreCase(select1.getCategory()))
			{
				ArrayList<String> answerChoices = new ArrayList<String>();
				String choice1 = select1.getCorrectAnswer();
				String choice2 = select1.getWrongAnswer1();
				String choice3 = select1.getWrongAnswer2();
				String choice4 = select1.getWrongAnswer3();

				answerChoices.add(choice1);
				answerChoices.add(choice2);
				answerChoices.add(choice3);
				answerChoices.add(choice4);
				Collections.shuffle(answerChoices);

				System.out.println(select1.getName() + "\n");

				System.out.println("A)" + answerChoices.get(0));
				System.out.println("B)" + answerChoices.get(1));
				System.out.println("C)" + answerChoices.get(2));
				System.out.println("D)" + answerChoices.get(3));

				Scanner sc = new Scanner(System.in);
				String guess = sc.nextLine();
				if(guess.equalsIgnoreCase("A"))
				{
					if(choice1.equals(answerChoices.get(0)))
					{
						correct = true;
						System.out.println("Correct!");
						score = updateScore(score,wager,correct);
						System.out.println(score);
					}
					else
					{
						correct = false;
						System.out.println("Incorrect.");
						score = updateScore(score,wager,correct);
						System.out.println(score);
					}
				}
				else if(guess.equalsIgnoreCase("B"))
				{
					if(choice1.equals(answerChoices.get(1)))
					{
						correct = true;
						System.out.println("Correct!");
						score = updateScore(score,wager,correct);
						System.out.println(score);
					}
					else
					{
						correct = false;
						System.out.println("Incorrect.");
						score = updateScore(score,wager,correct);
						System.out.println(score);
					}
				}
				else if(guess.equalsIgnoreCase("C"))
				{
					if(choice1.equals(answerChoices.get(2)))
					{
						correct = true;
						System.out.println("Correct!");
						score = updateScore(score,wager,correct);
						System.out.println(score);
					}
					else
					{
						correct = false;
						System.out.println("Incorrect.");
						score = updateScore(score,wager,correct);
						System.out.println(score);
					}
				}
				else if(guess.equalsIgnoreCase("D"))
				{
					if(choice1.equals(answerChoices.get(3)))
					{
						correct = true;
						System.out.println("Correct!");
						score = updateScore(score,wager,correct);
						System.out.println(score);
					}
					else
					{
						correct = false;
						System.out.println("Incorrect.");
						score = updateScore(score,wager,correct);
						System.out.println(score);
					}
				}
				questions.remove(select1);
			}
			else if(selectedCategory.equalsIgnoreCase(select2.getCategory()))
			{
				ArrayList<String> answerChoices = new ArrayList<String>();
				String choice1 = select2.getCorrectAnswer();
				String choice2 = select2.getWrongAnswer1();
				String choice3 = select2.getWrongAnswer2();
				String choice4 = select2.getWrongAnswer3();

				answerChoices.add(choice1);
				answerChoices.add(choice2);
				answerChoices.add(choice3);
				answerChoices.add(choice4);
				Collections.shuffle(answerChoices);

				System.out.println(select2.getName() + "\n");

				System.out.println("A)" + answerChoices.get(0));
				System.out.println("B)" + answerChoices.get(1));
				System.out.println("C)" + answerChoices.get(2));
				System.out.println("D)" + answerChoices.get(3));

				Scanner sc = new Scanner(System.in);
				String guess = sc.nextLine();
				if(guess.equalsIgnoreCase("A"))
				{
					if(choice1.equals(answerChoices.get(0)))
					{
						correct = true;
						System.out.println("Correct!");
						score = updateScore(score,wager,correct);
						System.out.println(score);
					}
					else
					{
						correct = false;
						System.out.println("Incorrect.");
						score = updateScore(score,wager,correct);
						System.out.println(score);
					}
				}
				else if(guess.equalsIgnoreCase("B"))
				{
					if(choice1.equals(answerChoices.get(1)))
					{
						correct = true;
						System.out.println("Correct!");
						score = updateScore(score,wager,correct);
						System.out.println(score);
					}
					else
					{
						correct = false;
						System.out.println("Incorrect.");
						score = updateScore(score,wager,correct);
						System.out.println(score);
					}
				}
				else if(guess.equalsIgnoreCase("C"))
				{
					if(choice1.equals(answerChoices.get(2)))
					{
						correct = true;
						System.out.println("Correct!");
						score = updateScore(score,wager,correct);
						System.out.println(score);
					}
					else
					{
						correct = false;
						System.out.println("Incorrect.");
						score = updateScore(score,wager,correct);
						System.out.println(score);
					}
				}
				else if(guess.equalsIgnoreCase("D"))
				{
					if(choice1.equals(answerChoices.get(3)))
					{
						correct = true;
						System.out.println("Correct!");
						score = updateScore(score,wager,correct);
						System.out.println(score);
					}
					else
					{
						correct = false;
						System.out.println("Incorrect.");
						score = updateScore(score,wager,correct);
						System.out.println(score);
					}
				}
				questions.remove(select2);
			}
			else if(selectedCategory.equalsIgnoreCase(select3.getCategory()))
			{
				ArrayList<String> answerChoices = new ArrayList<String>();
				String choice1 = select3.getCorrectAnswer();
				String choice2 = select3.getWrongAnswer1();
				String choice3 = select3.getWrongAnswer2();
				String choice4 = select3.getWrongAnswer3();

				answerChoices.add(choice1);
				answerChoices.add(choice2);
				answerChoices.add(choice3);
				answerChoices.add(choice4);
				Collections.shuffle(answerChoices);

				System.out.println(select3.getName() + "\n");

				System.out.println("A)" + answerChoices.get(0));
				System.out.println("B)" + answerChoices.get(1));
				System.out.println("C)" + answerChoices.get(2));
				System.out.println("D)" + answerChoices.get(3));

				Scanner sc = new Scanner(System.in);
				String guess = sc.nextLine();
				if(guess.equalsIgnoreCase("A"))
				{
					if(choice1.equals(answerChoices.get(0)))
					{
						correct = true;
						System.out.println("Correct!");
						score = updateScore(score,wager,correct);
						System.out.println(score);
					}
					else
					{
						correct = false;
						System.out.println("Incorrect.");
						score = updateScore(score,wager,correct);
						System.out.println(score);
					}
				}
				else if(guess.equalsIgnoreCase("B"))
				{
					if(choice1.equals(answerChoices.get(1)))
					{
						correct = true;
						System.out.println("Correct!");
						score = updateScore(score,wager,correct);
						System.out.println(score);
					}
					else
					{
						correct = false;
						System.out.println("Incorrect.");
						score = updateScore(score,wager,correct);
						System.out.println(score);
					}
				}
				else if(guess.equalsIgnoreCase("C"))
				{
					if(choice1.equals(answerChoices.get(2)))
					{
						correct = true;
						System.out.println("Correct!");
						score = updateScore(score,wager,correct);
						System.out.println(score);
					}
					else
					{
						correct = false;
						System.out.println("Incorrect.");
						score = updateScore(score,wager,correct);
						System.out.println(score);
					}
				}
				else if(guess.equalsIgnoreCase("D"))
				{
					if(choice1.equals(answerChoices.get(3)))
					{
						correct = true;
						System.out.println("Correct!");
						score = updateScore(score,wager,correct);
						System.out.println(score);
					}
					else
					{
						correct = false;
						System.out.println("Incorrect.");
						score = updateScore(score,wager,correct);
						System.out.println(score);
					}
				}
				questions.remove(select3);
			}
		}//put end of loop here
		
		if(score >= 1000)
		{
			System.out.println("You won!");
		}
		else
		{
			System.out.println("Sorry. You lost.");
		}
	}
	
	public static int updateScore(int score, int wager, boolean correct)
	{
		int oldScore = score;
		int newScore = 0;
		int change = wager;
		boolean posOrNeg = correct;
		
		if(posOrNeg == true)
		{
			newScore = oldScore + change;
		}
		else if(posOrNeg == false)
		{
			newScore = oldScore - change;
		}
		
		return newScore;
	}
	
	public static Question selectQuestions()
	{
		Random r = new Random();
		return questions.get(r.nextInt(questions.size()));
	}

}
