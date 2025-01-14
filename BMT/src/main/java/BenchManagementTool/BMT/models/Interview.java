package BenchManagementTool.BMT.models;

import BenchManagementTool.BMT.lib.Utils;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "interviews")
public class Interview {
    @Id
    private String id;

    @DBRef
    private Client client;

    @DBRef
    private Candidate candidate;

    private Utils.InterviewStatus interviewStatus;
    private Date interviewDate;
    private String interviewerName;
    private String project;
    private String clientRequirement;
    private String accoliteHiringManager;
    private String clientHiringManager;
    private String department;
    private List<String> comments;
}