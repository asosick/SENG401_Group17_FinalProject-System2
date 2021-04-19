package _io;

import java.io.IOException;

/**
 * ReadBinaryDataFactory class is a factory class tasked which creates a BinaryReadStream based on supplied user 
 * arguements. These classes are united through their ReadBinaryData interface.
 * 
 * Returns a type of binaryReadStream which inherits from ReadBinaryData interface
 */
public class ReadBinaryDataFactory {
    public ReadBinaryData getBinaryReadStream(String binStreamType, String fileName, int numBoardCards, int bufferSize) throws IOException{
        if(binStreamType == "ScoreGroup"){
            return new ReadBinaryScoreGroupStream(fileName, numBoardCards, bufferSize);
        }
        else if(binStreamType == "ScoreMaps"){
            return new ReadBinaryScoreMapsStream(fileName, numBoardCards, bufferSize);
        }
        else if(binStreamType == "ScoreStream"){
            return new ReadBinaryScoreStream(fileName, numBoardCards, bufferSize);
        }
        else{
            System.err.println("Incorrect String argurment supplied to ReadBinaryDataFactory class");
            return null;
        }
    }
}
