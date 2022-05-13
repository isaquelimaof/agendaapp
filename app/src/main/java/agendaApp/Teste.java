/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendaApp;

import controller.ProjectController;
import java.util.List;
import model.Project;

/**
 *
 * @author DevTech
 */
public class Teste {
    public static void main(String[] args) {
        
        Project project = new Project();
        ProjectController projectController = new ProjectController();
        project.setId(2);
        project.setName("Criando projeto 02...---");
        project.setDescription("Descreção do projeto 02");
        projectController.update(project);
        
        List<Project> projects = projectController.getAll();
        for(Project list : projects){
                    
        System.out.println("Teste 01:  " + list.getName());
        System.out.println("Teste 01:  " + list.getDescription());
        System.out.println("Teste 01:  " + list.getCreatedAt());
        System.out.println("Teste 01:  " + list.getUpdatedAt());
        }
        
        
    }

}
