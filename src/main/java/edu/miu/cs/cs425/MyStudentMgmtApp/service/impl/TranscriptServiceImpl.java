package edu.miu.cs.cs425.MyStudentMgmtApp.service.impl;

import org.springframework.stereotype.Service;

import edu.miu.cs.cs425.MyStudentMgmtApp.model.Transcript;
import edu.miu.cs.cs425.MyStudentMgmtApp.service.TranscriptService;

@Service
public class TranscriptServiceImpl implements TranscriptService {
    private TranscriptService transcriptService;

    TranscriptServiceImpl(TranscriptService transcriptService) {
        this.transcriptService = transcriptService;
    }

    @Override
    public Transcript saveTranscript(Transcript transcript) {
        try {
            return transcriptService.saveTranscript(transcript);
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

}
