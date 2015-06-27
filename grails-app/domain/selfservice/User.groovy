package selfservice

class User {

    String username
    String email
    static constraints = {
    email email:true,blank: false

    }
}
