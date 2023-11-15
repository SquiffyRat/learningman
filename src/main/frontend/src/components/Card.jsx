import React from 'react';

function Card({ name, role }) {
  return (
    <div>
      <div class='card'>
        <img
          src='src/img/test_profile_img.jpg'
          class='card-img-top'
          alt='...'
        />
        <div class='card-body'>
          <h5 class='card-title'>{name}</h5>
          <p class='card-text'>{role}</p>
        </div>
      </div>
    </div>
  );
}

export default Card;
