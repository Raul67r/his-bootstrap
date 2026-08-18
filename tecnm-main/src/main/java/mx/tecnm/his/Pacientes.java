package mx.tecnm.his;


@Entity
@Table(name = "pacientes")
public class Pacientes{
@Id
   String id;
   String name;
   String documentId;
   String status;
   int age;
   String lastVisit;

   public Pacientes() {
    }

   public Pacientes(String id, String name, String documentId, String status, int age, String lastVisit){
    this.id=id;
    this.name=name;
    this.documentId=documentId;
    this.status=status;
    this.age=age;
    this.lastVisit=lastVisit;
   }
   
    public String getId() { 
        return id;
     }
    public String getName() { 
        return name; 
    }
    public String getDocumentId() {
         return documentId; 
        }
    public String getStatus() {
         return status; 
        }
    public int getAge() {
         return age; 
        }
    public String getLastVisit() { 
        return lastVisit; 
    }

    // 4. SETTERS
    public void setId(String id) {
         this.id = id; 
        }
    public void setName(String name) {
         this.name = name; 
        }
    public void setDocumentId(String documentId) {
         this.documentId = documentId;
        }
    public void setStatus(String status) {
         this.status = status;
         }
    public void setAge(int age) {
         this.age = age;
         }
    public void setLastVisit(String lastVisit) {
         this.lastVisit = lastVisit; 
        }
}