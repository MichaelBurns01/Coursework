const mongoose = require('mongoose');
const dbURL = "mongodb://localhost:27017/usersdb";
const Contacts = require('../models/users');
//mongoose.set("strictQuery", false);

//mongoose.connect(process.env.MONGO_URL);

var usersArray = [];
var newuserName;
var newuserGender;

mongoose.createConnection(dbURL, {useUnifiedTopology: true, useNewUrlParser: true, family:4});
mongoose.connection;

console.log('listening on: ' + dbURL);



var users  = [
    {
        name: "Jack Brown",
        gender: "male"
    }
];
exports.showHomePage = (req, res) => { //Call back function for courses.ejs
    res.render("index");
}
/* defined again below
exports.postedSignUpForm = (req, res) => {
    res.render("users", {title: "Users"});
}
*/
exports.showUsers = (req, res) => {
    res.render("users", { registeredUsers: users });
}

exports.addUsers = (req, res) => {
    
    console.log("in home Controller addUser");
    var newuserName = req.body.name;
    console.log("name" + newuserName);
    var newuserGender = req.body.gender;

    users.push({name: newuserName, gender: newuserGender});
    // when render "users", you need to pass users as the value for "registeredUsers"
    res.render("users", {registeredUsers: users });
}

exports.postedSignUpForm = (req,res) => {
    console.log("In homecontroller - postedSignUpForm");
    res.render('contact'); 
};

let newContact = new Contacts ({
    name: newuserName,
    gender: newuserGender
})

newContact.save()
    .then((result) => {
        console.log('New user ${result.name} added successfully');

        usersArray.push({name: newuserName, gender: newuserGender});
    res.render('users', {
        allUsers: usersArray, title: "Users List"
    });//
})
.catch (error => {
    //res.send(error)
})

