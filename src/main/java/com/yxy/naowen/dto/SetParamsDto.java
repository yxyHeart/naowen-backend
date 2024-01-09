package com.yxy.naowen.dto;

import lombok.Data;

@Data
public class SetParamsDto {
    private Integer mixStimulusTeethTrials;
    private Integer mixStimulusTeethDuration;

    private Integer mixStimulusSsvepTrials; // 验证实验的混合范式中ssvep刺激 trial的个数
    private Integer mixStimulusSsvepTrialsDuration;
    private Integer mixStimulusSsvepStartFrequency;
    private Integer mixStimulusSsvepIntervalFrequency;

    private Integer mixStimulusRsvpFrequency; // 验证实验的混合范式中rsvp刺激的频率
    private Integer mixStimulusRsvpTrials;
    private Integer mixStimulusRsvpDuration;
}
