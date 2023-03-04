import './App.css'
import Logo from './img/emprel_logomarca.png'
import Table from '@mui/material/Table';
import TableBody from '@mui/material/TableBody';
import TableCell from '@mui/material/TableCell';
import TableContainer from '@mui/material/TableContainer';
import TableHead from '@mui/material/TableHead';
import TableRow from '@mui/material/TableRow';
import Paper from '@mui/material/Paper';

function createData(id, name, idade, fila) {
  return {id, name, idade, fila };
}

const rows = [
  createData ('01','Frozen yoghurt', 32, 1),
  createData ('02','Frozen yoghurt', 32, 1)

];


function App() {
  
  return(
    <div>
   <img src={Logo} alt='emprel' />

   <TableContainer component={Paper}>
      <Table sx={{ minWidth: 650 }} aria-label="simple table">
        <TableHead>
          <TableRow>
            <TableCell>id</TableCell>
            <TableCell>Pessoas</TableCell>
            <TableCell align="right">Idade</TableCell>
            <TableCell align="right">Fila</TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {rows.map((row) => (
            <TableRow
              key={row.name}
              sx={{ '&:last-child td, &:last-child th': { border: 0 } }}
            >
              <TableCell align="left">{row.id}</TableCell>
              <TableCell component="th" scope="row">
                {row.name}
              </TableCell>
              <TableCell align="right">{row.idade}</TableCell>
              <TableCell align="right">{row.fila}</TableCell>
            </TableRow>
          ))}
        </TableBody>
      </Table>
    </TableContainer>
  </div>
  );
}

export default App;
