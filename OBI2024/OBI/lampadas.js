const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let Ia, Ib, Fa, Fb;
let count = 0;

rl.question('Informe o estado inicial da lâmpada A: ', function(input) {
  Ia = parseInt(input);
  rl.question('Informe o estado inicial da lâmpada B: ', function(input) {
    Ib = parseInt(input);
    rl.question('Informe o estado final da lâmpada A: ', function(input) {
      Fa = parseInt(input);
      rl.question('Informe o estado final da lâmpada B: ', function(input) {
        Fb = parseInt(input);

        if (Ia !== Fa) {
          count++;
        } else if (Ib !== Fb) {
          count++;
        } else if (Ib !== Fb && Ia !== Fa) {
          count += 2;
        }

        console.log(count);
        rl.close();
      });
    });
  });
});
