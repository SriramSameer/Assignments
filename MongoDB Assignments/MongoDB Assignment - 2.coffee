mongoimport --db population --collection zipcodes --file zips.json

ATALANTA POPULATION

1) db.zipcodes.find({$ and:[{"City":"Atalanta"},{"State":"GA"}]}).pretty()
2) db.zipcodes.aggregate([{city:"Atalanta",State:"GA"}])
3) db.zipcodes.aggregate( [
    {$group:{_id : { city:"Atalanta",state: "GA"},totalzip: {$sum: "$zip"}}}])
4) db.zipcodes.aggregate( [   
    { $group : { _id : { city: "Atalanta", state:  "GA"}, totalPop: { $sum: "$pop" } } }])
    
 POPULATION BY STATE
 
 1) db.zipcodes.aggregate([ {population: {$sum: "$pop"}}])
 2) db.zipcodes.aggregate([$sort: { "_id.city": -1}])
 3) db.zipcodes.aggregate([{ $limit: 3}])
 
 POPULATION BY CITY 
 
  1) db.code.aggregate( [  
     { $group : { _id : { city: "$city", state:  "$state"}, totalPop: { $sum: "$pop" }])
  2)  db.zipcodes.aggregate([$sort: { "_id.city": -1}])
  3) db.zipcodes.aggregate([{ $limit: 3}])
  4) db.zipcodes.aggregate([{ $limit: 3}: {_id: {city: "Texas"}])
  
  BONUS
  
  1)db.zipcode.aggregate([{ $group: { _id: "$_id.state", avgCityPop: { $avg: "$pop" } } }])
  2)db.code.aggregate( [ { $sort: { "_id.city": -1}}, { $limit: 3}])