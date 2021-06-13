package assignment2.ex31;

/*
TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR

Example Output
Resting Pulse: 65        Age: 22

Intensity    | Rate
-------------|--------
55%          | 138 bpm
60%          | 145 bpm
65%          | 151 bpm
:               :        (extra lines omitted)
85%          | 178 bpm
90%          | 185 bpm
95%          | 191 bpm
*/

public class KarvonenCalc
{
    private int restPulse;
    private int age;

    public KarvonenCalc(int restPulse, int age)
    {
        this.restPulse = restPulse;
        this.age = age;
    }

    public double getTargetHeartRate(double intensity)
    {
        return Math.rint((((220.0 - this.age) - this.restPulse) * intensity/100.0) + this.restPulse);
    }
}
