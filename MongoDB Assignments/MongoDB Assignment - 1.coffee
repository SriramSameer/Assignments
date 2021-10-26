INSERT DOCUMENTS
           
            use mongo_practice

db.movies.insert([
	{
		title : "Fight Club",
		writer : "Chuck Palahniuk",
		year : 1999,
		actors : [
		  "Brad Pitt",
		  "Edward Norton",
		]
	},

	{
		title : "Pulp Fiction",
		writer : "Quentin Tarantino",
		year : 1994,
		actors : [
		  "John Travolta",
		  "Uma Thurman",
		]
	},

	{
		title : "Inglorious Basterds",
		writer : "Quentin Tarantino",
		year : 2009,
		actors : [
		  "Brad Pitt",
		  "Diane Kruger",
		  "Eli Roth",
		]
	},

	{
		title : "The Hobbit: An Unexpected Journey",
		writer : "J.R.R. Tolkein",
		year : 2012,
		franchise : "The Hobbit",
	},

	{
		title : "The Hobbit: The Desolation of Smaug",
		writer : "J.R.R. Tolkein",
		year : 2013,
		franchise : "The Hobbit",
	},

	{
		title : "The Hobbit: The Battle of the Five Armies",
		writer : "J.R.R. Tolkein",
		year : 2012,
		franchise : "The Hobbit",
		synopsis : "Bilbo and Company are forced to engage in a war against an array of combatants and keep the Lonely Mountain from falling into the hands of a rising darkness.",
	},
	{
		title : "Pee Wee Herman's Big Adventure"
	},
	{
		title : "Avatar"
	}
])



QUERY/FIND DOCUMENTS

            db.movies.find({}).pretty()
            db.movies.find({writer: "Quentin Tarantino"}).pretty()
            db.movies.find({"actors": "Brad Pitt"}).pretty()
            db.movies.find({franchise: "The Hobbit"}).pretty()
            db.movies.find({year: {$gte: 1990, $lte: 1999}}).pretty()
            db.movies.find({$or:[{year:{$lte:2000}}, {year:{$gte:2010}}]}).pretty()
            
UPDATE DOCUMENTS

             db.movies.update({title: "The Hobbit: An Unexpected Journey"}, {$set: {synopsis: "A reluctant hobbit, Bilbo Baggins, sets out to the Lonely Mountain with a spirited group of dwarves to reclaim their mountain home - and the gold within it - from the dragon Smaug."}})
             db.movies.update({title: "The Hobbit: The Desolation of Smaug"}, {$set: {synopsis: "The dwarves, along with Bilbo Baggins and Gandalf the Grey, continue their quest to reclaim Erebor, their homeland, from Smaug. Bilbo Baggins is in possession of a mysterious and magical ring."}})
             db.movies.update({title: "Pulp Fiction"}, {$push: {actors: "Samuel L. Jackson"}})  
             
             
  TEXT SEARCH 
  
              db.movies.find({synopsis: /.Bilbo./}).pretty()
              db.movies.find({synopsis: /.Gandalf./}).pretty()
              db.movies.find({$and: [{synopsis: /Bilbo/}, {synopsis: {$not: /Gandalf/}}]}).pretty()
              db.movies.find({$or: [{synopsis: /dwarves/}, {synopsis: /hobbit/}]}).pretty()
              db.movies.find({$and: [{synopsis: /gold/}, {synopsis: /dragon/}]}).pretty()
              
              
  DELETE DOCUMENTS
  
              db.movies.remove({title: "Pee Wee Herman's Big Adventure"})
              db.movies.remove({title: "Avatar"})
              
              
   RELATIONSHIPS
   
              db.posts.insert([
	{
		_id: 1,
		username : "GoodGuyGreg",
		title : "Passes out at party",
		body : "Wakes up early and cleans house",
	},

	{
		_id: 2,
		username : "GoodGuyGreg",
		title : "Steals your identity",
		body : "Raises your credit score",
	},

	{
		_id: 3,
		username : "GoodGuyGreg",
		title : "Reports a bug in your code",
		body : "Sends you a Pull Request",
	},

	{
		_id: 4,
		username : "ScumbagSteve",
		title : "Borrows something",
		body : "Sells it",
	},

	{
		_id: 5,
		username : "ScumbagSteve",
		title : "Borrows everything",
		body : "The end",
	},

	{
		_id: 6,
		username : "ScumbagSteve",
		title : "Forks your repo on github",
		body : "Sets to private",
	},
])

db.comments.insert([
	{
		username : "GoodGuyGreg",
		comment : "Hope you got a good deal!",
		post : 4,
	},
	{
		username : "GoodGuyGreg",
		comment : "What's mine is yours!",
		post : 5,
	},
	{
		username : "GoodGuyGreg",
		comment : "Don't violate the licensing agreement!",
		post : 6,
	},
	{
		username : "ScumbagSteve",
		comment : "It still isn't clean",
		post : 1,
	},
	{
		username : "ScumbagSteve",
		comment : "Denied your PR cause I found a hack",
		post : 3
	},
])


QUERY RELATED COLLECTIONS

        db.users.find({}).pretty()
        db.users.find({}).pretty()
        db.posts.find({username: "GoodGuyGreg"}).pretty()
        db.posts.find({username: "ScumbagSteve"}).pretty()
        db.comments.find({}).pretty()
        db.comments.find({username: "GoodGuyGreg"}).pretty()
        db.comments.find({username: "ScumbagSteve"}).pretty()
        db.comments.find({post: db.posts.findOne({title: "Reports a bug in your code"})._id})