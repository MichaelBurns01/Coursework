'use strict'

const { HTTP_VERSION_NOT_SUPPORTED } = require('http-status-codes');
const User = require('../models/users');

module.exports = {
index: ( req, res, next ) => {
    User.find()
      .then( users => {
        res.locals.users = users;
        console.log('Inside User.find -usersController: ${res.locals.users}')
        next();
      } )
      .catch( error => {
        console.log( `Error fetching users: ${error.message}` );
        next( error );
      } );
  },

  indexView: ( req, res ) => {
    console.log('usersController.indexView');
    if (req.query.format === 'json') {
        res.json(res.locals.users)
    } else {
        res.send('Unecessary');
    }
  },

  respondJSON: (req,res) => {
    console.log('userController.respondJSON');
    res.json ({
        //status: httpStatus.OK,
        data: res.locals

    })
  },
  errorJSON: (error, req, res, next) => {
    let errorObject;

    if (error){
        errorObject = {
            status: 500,
            message: errormessage
        };
    } else {
        errorObject = {
            status: 200,
            message: "Unknown error."
        };
    }

    res.json(errorObject);
  },

}