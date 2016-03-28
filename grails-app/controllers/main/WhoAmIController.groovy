package main

class WhoAmIController implements WhoAmITrait {

    def index() { 
      render currentUsername()   
    }
}
