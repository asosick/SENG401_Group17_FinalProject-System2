package _io;

import java.io.IOException;

public class WriteBinaryDataFactory {
 
    public WriteBinaryData getBinaryWriteStream(String binStreamType, String outFile, int numBoardCards, 
    byte[] holeCards, int numScoreGroups, int bufferSize)
    throws IOException{
        if(binStreamType == "ScoreGroup"){
            return new WriteBinaryScoreGroupStream(outFile, numBoardCards, holeCards, numScoreGroups, bufferSize);
        }
        else if(binStreamType == "ScoreMaps"){
            return new WriteBinaryScoreMaps(outFile, numBoardCards, holeCards, numScoreGroups, bufferSize);
        }
        else if(binStreamType == "ScoreStream"){
            return new WriteBinaryScoreStream(outFile, numBoardCards, holeCards, bufferSize);
        }
        else{
            System.err.println("Incorrect String argurment supplied to WriteBinaryDataFactory class");
            return null;
        }
    }
}
