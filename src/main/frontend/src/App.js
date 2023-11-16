// src/main/frontend/src/App.js
import Login from './pages/Login';
import Register from './pages/Register';
import Header from './components/Header';
import Card from './components/Card';
import Student from './components/Student';
import Teacher from './components/Teacher';

import { Link } from 'react-router-dom';
import { HashRouter as Router, Routes, Route } from 'react-router-dom';
import axios from 'axios';

import React, { useEffect, useState } from 'react';

function App() {
  return (
    <div>
      <Router>
        <Header />
        <Routes>
          <Route path='/' element={<Card/>} />
          <Route path='/login' element={<Login />} />
          <Route path='/register' element={<Register />} />
          <Route path='/student' element={<Student />} />
          <Route path='/teacher' element={<Teacher />} />
        </Routes>
      </Router>
    </div>
  );

}

export default App;
