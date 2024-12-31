var express = require('express'); //Requiring express
app = express(); // Instatiate express application
const layouts = require("express-ejs-layouts")


const path = require('path');

const router = express.Router();

errorController = require('./controllers/errorController');
homeController = require('./controllers/homeController');

// set the view engine to ejs
app.set('view engine', 'ejs');
app.use(layouts);
app.use(express.json());
app.use(express.static(__dirname + '/views'));
// use res.render to load up an ejs view file

// index page
/* defined in the homeController
app.get('/', function(req, res) {
  res.render('index');
});
*/
/* These are defined in the homeController
app.get('/users', function(req, res) {
  res.render('users');
});


app.get('/contacts', function(req, res) {
  res.render('contacts');
})
*/

app.use(
  express.urlencoded({
    extended: false
  })
)

//app.set( 'views', path.join(__dirname, "views")); already deefined

app.get('/', homeController.showHomePage);
app.get('/users', homeController.showUsers);

// when /contact is entered, we show the sign-up form
app.get('/contact', homeController.postedSignUpForm);
// When the form is submitted, we add users
app.post('/submit',homeController.addUsers );

app.listen(3000);
console.log('The server is listening on port number: ${port}')


