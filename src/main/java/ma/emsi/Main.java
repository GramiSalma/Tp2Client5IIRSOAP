package ma.emsi;

import stub.ServiceEtudiant;
import stub.ServiceStudent;
import stub.Student;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            ServiceStudent wsdl= new ServiceEtudiant().getServiceStudentPort();
            List<Student> liste=wsdl.listEtudiants();
            liste.forEach(elm->{System.out.println(elm.getNom()
                    +"----"+elm.getPrenom());});
    }
}























































































































