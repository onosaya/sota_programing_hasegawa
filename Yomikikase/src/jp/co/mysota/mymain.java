//このソースは、VstoneMagicによって自動生成されました。
//ソースの内容を書き換えた場合、VstoneMagicで開けなくなる場合があります。
package	jp.co.mysota;
import	main.main.GlobalVariable;
import	jp.vstone.RobotLib.*;
import	jp.vstone.sotatalk.*;
import	jp.vstone.sotatalk.SpeechRecog.*;
import	java.awt.Color;

public class mymain
{

	public CRobotPose pose;
	public jp.co.mysota.kumonoito kumonoito;
	public String speechRecogResult;
	public RecogResult recogresult;
	public mymain()																										//@<BlockInfo>jp.vstone.block.func.constructor,32,32,352,32,False,5,@</BlockInfo>
	{
																														//@<OutputChild>
		/*CRobotPose pose*/;																							//@<BlockInfo>jp.vstone.block.variable,96,32,96,32,False,4,break@</BlockInfo>
																														//@<EndOfBlock/>
		kumonoito=new jp.co.mysota.kumonoito();																			//@<BlockInfo>jp.vstone.block.variable,160,32,160,32,False,3,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*String speechRecogResult*/;																					//@<BlockInfo>jp.vstone.block.variable,224,32,224,32,False,2,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*RecogResult recogresult*/;																					//@<BlockInfo>jp.vstone.block.variable,288,32,288,32,False,1,break@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void main()																									//@<BlockInfo>jp.vstone.block.func,64,176,720,400,False,14,コメント@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		GlobalVariable.sotawish.Say((String)"はじめるよ．何を読もうか．蜘蛛の糸があります．または，終わりと言ってください．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,128,176,128,176,False,13,@</BlockInfo>
																														//@<EndOfBlock/>
		while(GlobalVariable.TRUE)																						//@<BlockInfo>jp.vstone.block.while.endless,192,176,608,400,False,12,Endless@</BlockInfo>
		{

																														//@<OutputChild>
			recogresult = GlobalVariable.recog.getRecognitionwithAbort((int)60000);										//@<BlockInfo>jp.vstone.block.talk.speechrecog.score2,112,304,480,304,False,11,音声認識を行い、認識候補との完全一致で比較する。認識スコアが一番高い結果に分岐する。実際に認識された文字列はspeechRecogResultに代入される@</BlockInfo>
			speechRecogResult = recogresult.CheckBest(new String[]{
			 "蜘蛛の糸" ,  "おわり" ,  "" , 
			},false);
			if(speechRecogResult == null) speechRecogResult = "";

			if(speechRecogResult.contains((String)"蜘蛛の糸"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					kumonoito.talk();																						//@<BlockInfo>jp.vstone.block.callfunc.base,176,304,176,304,False,8,@</BlockInfo>	@<EndOfBlock/>
					GlobalVariable.sotawish.Say((String)"おわります．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,304,304,304,304,False,7,@</BlockInfo>
																															//@<EndOfBlock/>
					break;																									//@<BlockInfo>jp.vstone.block.break,368,304,368,304,False,6,break@</BlockInfo>	@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)"おわり"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"おわります．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,176,400,176,400,False,10,@</BlockInfo>
																															//@<EndOfBlock/>
					break;																									//@<BlockInfo>jp.vstone.block.break,304,400,304,400,False,9,break@</BlockInfo>	@<EndOfBlock/>
																																//@</OutputChild>

			}
			else
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"何を読もうか．蜘蛛の糸があります．または，終わりと言ってください．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,176,496,176,496,False,15,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
																														//@<EndOfBlock/>
																														//@</OutputChild>
		}
																														//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

}
