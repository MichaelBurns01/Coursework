const router = require('express').Router();
const usersController = require('../controllers/usersController');
const { route } = require('./userRoutes');

router.get('/users', usersController.index, usersController.respondJSON);

module.exports = router;
