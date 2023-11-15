import React, { useState } from 'react';
import Card from '../components/Card';
import axios from 'axios';

function Student() {
  const [memberName, setMemberName] = useState('');
  const [memberRole, setMemberRole] = useState('');

  const getCardContent = async (e) => {
    await axios.get();
  };
  return (
    <div>
      <Card name={memberName} role={memberRole} />
    </div>
  );
}

export default Student;
