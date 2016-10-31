//このソースは、VstoneMagicによって自動生成されました。
//ソースの内容を書き換えた場合、VstoneMagicで開けなくなる場合があります。
package	jp.co.mysota;
import	main.main.GlobalVariable;
import	jp.vstone.RobotLib.*;
import	jp.vstone.sotatalk.*;
import	jp.vstone.sotatalk.SpeechRecog.*;
import	java.awt.Color;

public class rabit
{

	public CRobotPose pose;
	public rabit()																										//@<BlockInfo>jp.vstone.block.func.constructor,16,16,144,16,False,2,@</BlockInfo>
	{
																														//@<OutputChild>
		/*CRobotPose pose*/;																							//@<BlockInfo>jp.vstone.block.variable,80,16,80,16,False,1,break@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void talk()																									//@<BlockInfo>jp.vstone.block.func,32,208,656,208,False,5,@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		GlobalVariable.sotawish.Say((String)"青空文庫　あなうさピーターのはなし　を読みます．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,96,208,96,208,False,4,@</BlockInfo>
																														//@<EndOfBlock/>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.pose,160,208,160,208,False,3,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{0,-900,0,900,0,0,0,0}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
						new Short[]{0,-255,0,180,80,0,180,80,0}
						);
		GlobalVariable.motion.play(pose,1600);
		CRobotUtil.wait(1600);																							//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"ぼくは もう しぬんだな、 ピーターは おおつぶの なみだを ながしました。 でも そのなきごえが たまたま やさしい すずめたちにも きこえて、 そして あわてて そばに とんできて あきらめないでと いうのです。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,224,208,224,208,False,43,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"マグレガーおじさんが やってきて もってきた ふるいを ピーターの うえから ぱっと かぶせようと しました が、 ピーターは すんでのところで うわぎを ぬぎぬぎ あとに のこして にげだしました。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,288,208,288,208,False,42,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"そして ものおきごやに かけこんで じょうろのなかに とびこみました。 とってもいい かくればだと おもったのに みずが たくさん はいっているなんて。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,352,208,352,208,False,41,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"マグレガーおじさんには まるわかりでした。 ピーターは ぜったい ものおきごやの どこかに いる。 もしかすると うえきばちの なかかもしれない。 やがて そろりと もちあげて ひとつずつ なかを みるのです。 まさに そのとき ピーターが くしゃみを ――「はっくしゅん！」 マグレガーおじさんが たちまち ちかづきます。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,416,208,416,208,False,40,@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

	//@<Separate/>
	/*
	GlobalVariable.sotawish.Say((String)"むかしむかし　あるところに　よんひき の　子兎が　おりました。　なまえは　それぞれ　フロプシー、モプシー、カトンテル、ピーターです。よんひき は　おかあさんと　いっしょに　とってもおおきな　モミのきの　したにある　あなのなかに　すんでいました。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,112,320,112,320,False,29,@</BlockInfo>
																														//@<EndOfBlock/>
	GlobalVariable.sotawish.Say((String)"あるひの朝、　「あなうさママ」が　いいました。「さあ　おまえたち、　のはら の なか や　小道のさきで　あそんでらっしゃい。　でも、　マグレガーおじさんの　お庭には　いっちゃダメよ。　むかし　おとうさんが　そこで　ひょんなことから　マグレガーおばさんに　つかまって　パイに　されたんだから。」",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,176,320,176,320,False,28,@</BlockInfo>
																														//@<EndOfBlock/>
	GlobalVariable.sotawish.Say((String)"つぎの　ぺーじ　を　めくって",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,240,320,240,320,False,27,@</BlockInfo>
																														//@<EndOfBlock/>
	CRobotUtil.wait((int)5000);																							//@<BlockInfo>jp.vstone.block.wait,304,320,304,320,False,26,コメント@</BlockInfo>	@<EndOfBlock/>
	GlobalVariable.sotawish.Say((String)"「いってらっしゃい、気をつけるのよ。　おかあさん、　るすに　してるから。」",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,368,320,368,320,False,25,@</BlockInfo>
																														//@<EndOfBlock/>
	GlobalVariable.sotawish.Say((String)"それから　「あなうさママ」は　かごと　かさを　てにもって、　もりの　むこうの　パンやさんへ　むかいました。　買ったのは　いっきんの　くろパンと　ぶどうパンを　５つです。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,432,320,432,320,False,24,@</BlockInfo>
																														//@<EndOfBlock/>
	GlobalVariable.sotawish.Say((String)"つぎの　ぺーじ　を　めくって",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,496,320,496,320,False,23,@</BlockInfo>
																														//@<EndOfBlock/>
	CRobotUtil.wait((int)5000);																							//@<BlockInfo>jp.vstone.block.wait,560,320,560,320,False,22,コメント@</BlockInfo>	@<EndOfBlock/>
	GlobalVariable.sotawish.Say((String)"フロプシーと　モプシーと　カトンテルは　とっても　良い子でしたので、　小道をくだって　クロイチゴ摘みに出かけました。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,112,400,112,400,False,21,@</BlockInfo>
																														//@<EndOfBlock/>
	GlobalVariable.sotawish.Say((String)"けれども　ピーターは　ひどく　やんちゃでしたので、　そのまま　マグレガーおじさんのお庭に一目散、　入り口の柵の下を　むりくり　くぐり抜けたのです！",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,176,400,176,400,False,20,@</BlockInfo>
																														//@<EndOfBlock/>
	GlobalVariable.sotawish.Say((String)"つぎの　ぺーじ　を　めくって",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,240,400,240,400,False,19,@</BlockInfo>
																														//@<EndOfBlock/>
	CRobotUtil.wait((int)5000);																							//@<BlockInfo>jp.vstone.block.wait,304,400,304,400,False,18,コメント@</BlockInfo>	@<EndOfBlock/>
	GlobalVariable.sotawish.Say((String)"すぐさま レタスと インゲンを かじって おまけに ハツカダイコンまで。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,368,400,368,400,False,17,@</BlockInfo>
																														//@<EndOfBlock/>
	GlobalVariable.sotawish.Say((String)"すると どうも きぶんが わるくなったので おくすりの パセリを さがすことに しました。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,432,400,432,400,False,16,@</BlockInfo>
																														//@<EndOfBlock/>
	GlobalVariable.sotawish.Say((String)"つぎの　ぺーじ　を　めくって",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,496,400,496,400,False,15,@</BlockInfo>
																														//@<EndOfBlock/>
	CRobotUtil.wait((int)5000);																							//@<BlockInfo>jp.vstone.block.wait,560,400,560,400,False,14,コメント@</BlockInfo>	@<EndOfBlock/>
	GlobalVariable.sotawish.Say((String)"ところが　キュウリの苗箱を回った所で出くわしたのが、　なんと　マグレガーおじさん！",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,112,480,112,480,False,13,@</BlockInfo>
																														//@<EndOfBlock/>
	GlobalVariable.sotawish.Say((String)"マグレガーおじさんは四つん這いで　キャベツの苗を植えていたのですが、　跳びあがって　ピーターを追いかけます。　鍬を振り振り叫ぶのです。　「まてえ、　ぬすっと！」",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,176,480,176,480,False,12,@</BlockInfo>
																														//@<EndOfBlock/>
	GlobalVariable.sotawish.Say((String)"つぎの　ぺーじ　を　めくって",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,240,480,240,480,False,11,@</BlockInfo>
																														//@<EndOfBlock/>
	CRobotUtil.wait((int)5000);																							//@<BlockInfo>jp.vstone.block.wait,304,480,304,480,False,10,コメント@</BlockInfo>	@<EndOfBlock/>
	GlobalVariable.sotawish.Say((String)"ピーターは　もう　びっくりして　震えあがって庭中を駆け回りました。　それというのも入り口が　どこにあったのか　分からなくなったのです。しかも　キャベツ畑で靴を片っぽ、　ジャガイモ畑で　もう片っぽ　無くしてしまいました。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,368,480,368,480,False,9,@</BlockInfo>
																														//@<EndOfBlock/>
	GlobalVariable.sotawish.Say((String)"靴も無いので　よつ足で走ると　ぐんぐん　速くなって、　うまく行けば逃げられたと思うのですが、　運悪く　スグリの網に　つっこんでしまい、　上着の大きなボタンが引っかかってしまったのです。　ちなみに　青の上着で真鍮のボタンつき　おろしたての物でした。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,432,480,432,480,False,8,@</BlockInfo>
																														//@<EndOfBlock/>
	GlobalVariable.sotawish.Say((String)"つぎの　ぺーじ　を　めくって",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,496,480,496,480,False,7,@</BlockInfo>
																														//@<EndOfBlock/>
	CRobotUtil.wait((int)5000);																							//@<BlockInfo>jp.vstone.block.wait,560,480,560,480,False,6,コメント@</BlockInfo>	@<EndOfBlock/>

	*/

	//@<Separate/>
	/*
	GlobalVariable.sotawish.Say((String)"あしで ふみつけられそうに なりましたが、 ピーターは まどの そとへと とびだして ついでに うえきを ３つ たおしました。 まどが ちいさすぎたので、 マグレガーおじさんも ピーターを おいかけるのを あきらめて のらしごとへ もどることに しました。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,96,608,96,608,False,32,@</BlockInfo>
																														//@<EndOfBlock/>
	GlobalVariable.sotawish.Say((String)"ピーターは ほっとして こしを おちつけます。 いきも きれぎれ、 こころも ぶるぶる、 どっちへいったら いいのか ちっとも わかりません。 しかも じょうろのなかに いたので もう ずぶぬれです。 しばらくして うろちょろ しはじめましたが、 とぼとぼ ―― とぼとぼ ―― ゆっくりと あるいて きょろきょろ。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,160,608,160,608,False,31,@</BlockInfo>
																														//@<EndOfBlock/>
	GlobalVariable.sotawish.Say((String)"かべに ドアを みつけましたが、 かぎが しまっていて したを くぐりぬけようにも ぷっくりした こうさぎの とおる すきまは ありません。 おかあさんねずみが いしの とぐちを はいったり でたりして きのなかで まっている かぞくに おまめを はこんでいます。 ピーターは そのねずみに いりぐちへの いきかたを ききましたが、 くちに おおきな おまめを くわえていましたので ねずみは なにも へんじが できません。 ただ くびを ふるだけなので、 ピーターは なみだが でてきました。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,224,608,224,608,False,30,@</BlockInfo>
																														//@<EndOfBlock/>

	*/

	//@<Separate/>
	/*
	GlobalVariable.sotawish.Say((String)"それから おにわを つっきって かえりみちを さがそうと しましたが、 よけいに まよってしまいました。 やがて マグレガーおじさんが みずくみをする ためいけのところへ たどりつきます。 しろい ねこが きんぎょを じっと にらんでいて ぴくりとも うごきませんが ときたま しっぽの さきが いきものみたいに くねくねと していました。 ピーターは そっとしておくのが いちばんだと おもいました。 いとこの ばにばにベンジャミンくんから ねこのことは それなりに きいていたのです。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,288,608,288,608,False,33,@</BlockInfo>
																														//@<EndOfBlock/>

	*/

	//@<Separate/>
	/*
	GlobalVariable.sotawish.Say((String)"ものおきごやに もどろうとすると いきなり すぐそばから くわの おとが きこえてきました。 さっくり、 さくさく、 さっくり。 ピーターは しげみのしたを あたふたと はしりまわります。 けれども なんということも ないので すぐに でていって ておしぐるまの うえへ のぼり ようすを うかがってみました。 まず みえたのが タマネギばたけを たがやす マグレガーおじさん、 ピーターには せなかを むけていて なんと そのむこうに いりぐちが あるのです！",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,384,608,384,608,False,37,@</BlockInfo>
																														//@<EndOfBlock/>
	GlobalVariable.sotawish.Say((String)"ピーターは おとも たてずに ておしぐるまを おりて ぜんそくりょくで はしりだしました。 クロスグリの しげみのうら まっすぐ みちを すすみます。 かどのところで マグレガーおじさんに みつかりましたが ピーターは かまいません。 いりぐちのしたに すべりこんで とうとう にわのそと、 もりに はいれば あんぜんです。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,448,608,448,608,False,36,@</BlockInfo>
																														//@<EndOfBlock/>
	GlobalVariable.sotawish.Say((String)"マグレガーおじさんは ちいさな うわぎと くつを ぼうに ひっかけ からすよけの かかしに しました。 ピーターは そのままずっと はしりっぱなしで ふりかえることもなく おおきな モミのきの おうちまで かえりました。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,512,608,512,608,False,35,@</BlockInfo>
																														//@<EndOfBlock/>
	GlobalVariable.sotawish.Say((String)"もう くたくたなので うさぎあなの ふかふかした やわらかい つちの じめんに ねっころがると まぶたが すぐに おちます。 おかあさんは おりょうりの さいちゅうで てが はなせませんでしたが、 みにつけていたものは どうしたのかしらと くびを かしげました。 つい このあいだも うわぎと くつを なくしたっていうのに。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,576,608,576,608,False,34,@</BlockInfo>
																														//@<EndOfBlock/>

	*/

	//@<Separate/>
	/*
	GlobalVariable.sotawish.Say((String)"なんといったら いいのか、 ピーターは そのひの ばんは ずっと ぐあいが よくありませんでした。 おかあさんは ベッドに ねかしつけ カモミールの おちゃを つくってあげました。 ピーターへの おくすりと いうわけです！ 「ねるまえに おおさじいっぱい のむこと。」",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,96,704,96,704,False,39,@</BlockInfo>
																														//@<EndOfBlock/>
	GlobalVariable.sotawish.Say((String)"かたや フロプシーと モプシーと カトンテルは ばんごはんに パンと ぎゅうにゅうと クロイチゴを たべました。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,160,704,160,704,False,38,@</BlockInfo>
																														//@<EndOfBlock/>

	*/

}
