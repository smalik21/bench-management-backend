package BenchManagementTool.BMT.dto;

import BenchManagementTool.BMT.lib.InterviewSummary;
import BenchManagementTool.BMT.lib.Utils;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Builder;
import java.util.Date;
import java.util.List;

@Data
@Builder
public class CandidateDTO {
    private String id;

    @NotEmpty(message = "Employee ID cannot be empty")
    private String empId;

    @NotEmpty(message = "Name cannot be empty")
    private String name;

    @NotEmpty(message = "Skill cannot be empty")
    private String skill;

    @NotNull(message = "Past experience cannot be null")
    private Integer pastExperience;

    @NotEmpty(message = "Base location cannot be empty")
    private Utils.Location baseLocation;

    @NotEmpty(message = "Status cannot be empty")
    private Utils.Status status;

    @NotNull(message = "Accolite DOJ cannot be null")
    private Date accoliteDoj;

    @NotNull(message = "On Bench cannot be null")
    private boolean onBench;

    @NotNull(message = "Bench Start Date cannot be null")
    private Date benchStartDate;

    private String clientId;
    private Date tentativeOnboardingDate;
    private String remarks;
    private String mentorship;
    private Utils.Location currentLocation;
    private String thLink;

    private Date lwdInAccolite;
    private String projectType;
    private String projectAllocationStatus;
    private Date selectionDate;
    private Date onboardingDate;

    private List<InterviewSummary> interviews;
}
