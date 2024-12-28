var express = require('express'); //Requiring express
app = express(); // Instatiate express application
const layouts = require("express-ejs-layouts")
const methodOverride = require('method-override');
const mongoose = require('mongoose');
const apiRoute = require("./routes/apiRoutes");
const usersRoute = require("./routes/userRoutes");
const router = express.Router();



mongoose.Promise = global.Promise;
mongoose.connect('mongodb://0.0.0.0:27017/usersdb',
{
  useNewUrlParser: true, useUnifiedTopology: true
});

const db = mongoose.connection;


const path = require('path');


const port = process.env.PORT || 3000;

errorController = require('./controllers/errorController');
homeController = require('./controllers/homeController');

// set the view engine to ejs
app.set('view engine', 'ejs');
app.use(layouts);
app.use(express.json());
app.use(express.static(__dirname + '/views'));

app.use(methodOverride('_method', {
  methods: ['POST', 'GET']
}));

app.use(express.static('public'));

console.log("Pass --4");
app.use('/api', apiRoute);

console.log('Pass --5');
app.use('/', usersRoute); //might have to get changed to usersRoute ???

app.use(
  express.urlencoded({
    extended: false
  })
)

app.get('/', homeController.showHomePage);
app.get('/users', homeController.showUsers);

// when /contact is entered, we show the sign-up form
app.get('/contact', homeController.postedSignUpForm);
// When the form is submitted, we add users
app.post('/submit',homeController.addUsers );
module.exports = router;

app.listen(port, () => {
  console.log(`Server is running on port: ${port}`);
});


