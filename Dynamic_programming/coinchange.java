function coin(coins, amount) {
    const dp = new Array(amount + 1);
    dp.fill(amount + 1);
    dp[0] = 0;
    for (let i = 1; i <= amount; i++) {
        for (let c of coins) {
            if (i - c >= 0) {
                dp[i] = Math.min(dp[i], 1 + dp[i - c]);
            }
        }
    }
    return dp[amount];
}

function main() {
    const readline = require('readline');
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });
    
    rl.question('', (n) => {
        const numCoins = parseInt(n);
        const coins = [];
        let count = 0;
        
        const askForCoin = () => {
            if (count < numCoins) {
                rl.question('', (coin) => {
                    coins.push(parseInt(coin));
                    count++;
                    askForCoin();
                });
            } else {
                rl.question('', (amount) => {
                    const amt = parseInt(amount);
                    console.log(coin(coins, amt));
                    rl.close();
                });
            }
        };
        
        askForCoin();
    });
}

main();