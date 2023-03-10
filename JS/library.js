class Media {
    constructor(title){
      this._title = title;
      this._isCheckedOut = false;
      this._ratings = [];
    }
  
    get title() {
      return this._title;
    }
  
    get isCheckedOut() {
      return this._isCheckedOut;
    }
  
    get ratings() {
      return this._ratings
    }
  
    setCheckedOut(update){
      this._isCheckedOut = update;
    }
  
    toggleCheckOutStatus() {
      if (this.isCheckedOut){
        this.setCheckedOut(false);
      } else {
          this.setCheckedOut(true);
      }
    }

    getAverageRating() {
        let sum = this.ratings.reduce((acc,current) => {
            return acc + current
        },0)
        sum = sum/this.ratings.length;
        return sum;
    }
  }


class Book extends Media{
    constructor(author,title,pages){
        super(title)
        this._author = author;
        this._pages = pages;
    }

    get author(){
        return this._author;
    }

    get pages() {
        return this._pages;
    }
}


class Movie extends Media {
    constructor(director,runTime,title){
        super(title)
        this._director = director;
        this._runTime = runTime;
    }

    get director() {
        return this._director;
    }

    get runTime() {
        return this._runTime;
    }
}

const historyOfEverything = new Book('Bill Bryson',
'A Short History of Nearly Everything',544);

historyOfEverything.toggleCheckOutStatus();
console.log(historyOfEverything.isCheckedOut())