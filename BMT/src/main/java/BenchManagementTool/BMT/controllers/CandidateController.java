package BenchManagementTool.BMT.controllers;

import BenchManagementTool.BMT.models.Candidate;
import BenchManagementTool.BMT.services.CandidatesService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/candidates")
public class CandidateController {

    @Autowired
    private CandidatesService candidateService;

    @GetMapping
    public List<Candidate> getAllCandidates() {
        return candidateService.getAllCandidates();
    }

    @PostMapping
    public Candidate createCandidate (@Valid @RequestBody Candidate candidate) {
        return candidateService.createCandidate(candidate);
    }

    // Endpoint to get employee data by MongoDB ID
    @GetMapping("/id/{id}")
    public Candidate getCandidateById(@PathVariable String id) {
        return candidateService.getCandidateById(id);
    }

    // Endpoint to get employee data by empId
    @GetMapping("/empId/{empId}")
    public Candidate getCandidateByEmpId(@PathVariable String empId) {
        return candidateService.getCandidateByEmpId(empId);
    }
}
