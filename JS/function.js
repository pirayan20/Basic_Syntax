const getUserChoice = userInput =>{
    userInput = userInput.toLowerCase();
    if (userInput === "rock" || userInput === "paper" || userInput === "scissors"){
      return userInput
    } else {
      return 'Error!';
    }
  }
  
  const getComputerChoice = () => {
    const num = Math.floor(Math.random()*3);
    switch (num) {
      case 0:
        return "rock";
      case 1:
        return "paper";
      default :
        return "scissors"
    }
  }
  
  // switch
  const determineWinner = (userChoice,computerChoice) => {
    if (userChoice === computerChoice) {
      return "Tie!"
    } else {
      let chil
      switch (userChoice){
        case "rock":
            computerChoice === "paper"? chil = "Computer won!" : chil = "Human won"
            return chil
        case "paper":
            computerChoice === "scissors"? chil = "Computer won!" : chil = "Human won"
            return chil
        case "scissors":
            computerChoice === "rock"? chil = "Computer won!" : chil = "Human won"
            return chil
      }
    }
  }
  
console.log(determineWinner('rock','paper'));