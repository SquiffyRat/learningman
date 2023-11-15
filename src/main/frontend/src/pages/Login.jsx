import { useNavigate } from 'react-router-dom';
import Card from '../components/Card';

function Login() {
  const nav = useNavigate();

  const goRegister = () => {
    nav('/Register');
  };

  return (
    <div>
      <Card />
      <button onClick={goRegister}>회원가입</button>
    </div>
  );
}
export default Login;
