//このソースは、VstoneMagicによって自動生成されました。
//ソースの内容を書き換えた場合、VstoneMagicで開けなくなる場合があります。
package	jp.co.mysota;
import	main.main.GlobalVariable;
import	jp.vstone.RobotLib.*;
import	jp.vstone.sotatalk.*;
import	jp.vstone.sotatalk.SpeechRecog.*;
import	java.awt.Color;

public class kumonoito
{

	public CRobotPose pose;
	public kumonoito()																									//@<BlockInfo>jp.vstone.block.func.constructor,16,16,256,16,False,2,@</BlockInfo>
	{
																														//@<OutputChild>
		/*CRobotPose pose*/;																							//@<BlockInfo>jp.vstone.block.variable,80,16,80,16,False,1,break@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void talk()																									//@<BlockInfo>jp.vstone.block.func,80,112,528,336,False,23,@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		GlobalVariable.sotawish.Say((String)"芥川龍之介　の　蜘蛛の糸　を読みます．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,144,112,144,112,False,22,@</BlockInfo>
																														//@<EndOfBlock/>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.pose,208,112,208,112,False,21,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{0,-900,0,900,0,0,0,0}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
						new Short[]{0,-255,0,180,80,0,180,80,0}
						);
		GlobalVariable.motion.play(pose,2000);
		CRobotUtil.wait(2000);																							//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"ある日の事でございます。御釈迦様は極楽の蓮池のふちを、ひとりでぶらぶら御歩きになっていらっしゃいました。池の中に咲いている蓮の花は、みんな玉のようにまっ白で、そのまん中にある金色のずいからは、何とも云えない好いにおいが、絶間なくあたりへ溢れて居ります。極楽は丁度朝なのでございましょう。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,400,112,400,112,False,20,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"やがて御釈迦様はその池のふちにおたたずみになって、水の　おもてを　おおっている蓮の葉の間から、ふと下のようすを御覧になりました。この極楽の蓮池の下は、丁度地獄の底に当って居りますから、水晶のような水を透きとおして、さんずの河や針の山の景色が、丁度　のぞき眼鏡　を見るように、はっきりと見えるのでございます。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,464,112,464,112,False,19,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"するとその地獄の底に、かんだた　という男が一人、ほかの罪人と一緒にうごめいている姿が、御眼に止まりました。この　かんだた　という男は、人を殺したり家に火をつけたり、いろいろ悪事を働いた　おおどろぼう　でございますが、それでもたった一つ、善い事を致した覚えがございます。と申しますのは、ある時この男が深い林の中を通りますと、小さな蜘蛛が一匹、路ばたを　這って　行くのが見えました。そこで　かんだた　は早速足を挙げて、踏み殺そうと致しましたが、「いや、いや、これも小さいながら、命のあるものに違いない。その命をむやみにとると云う事は、いくら何でも可哀そうだ。」と、こう急に思い返して、とうとう　その蜘蛛を殺さずに助けてやったからでございます。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,528,112,528,112,False,18,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"御釈迦様は地獄のようすを御覧になりながら、この　かんだた　には蜘蛛を助けた事があるのを御思い出しになりました。そうして　それだけの善い事をしたむくいには、出来るなら、この男を地獄から救い出してやろうと御考えになりました。幸い、かたわらを見ますと、ひすいのような色をした蓮の葉の上に、極楽の蜘蛛が一匹、美しい銀色の糸をかけて居ります。御釈迦様はその蜘蛛の糸をそっと御手に御取りになって、玉のような　しらはす　の間から、遥か　下にある地獄の底へ、まっすぐにそれを降ろしなさいました。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,592,112,592,112,False,17,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"これで第一部は終わり，次は第二部です．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,112,224,112,224,False,16,@</BlockInfo>
																														//@<EndOfBlock/>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.pose,176,224,176,224,False,15,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{0,-900,0,900,0,0,0,0}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
						new Short[]{0,-255,0,180,80,0,180,80,0}
						);
		GlobalVariable.motion.play(pose,3000);
		CRobotUtil.wait(3000);																							//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"こちらは地獄の底の血の池で、ほかの罪人と一緒に、浮いたり沈んだりしていた　かんだた　でございます。何しろどちらを見ても、まっ暗で、たまにその暗闇からぼんやり浮き上っているものがあると思いますと、それは　おそろしい　針の山の針が光るのでございますから、その心細さと云ったらございません。その上あたりは墓の中のように　しんと静まり返って、たまに聞えるものと云っては、ただ罪人がつく　微かな　たんそく　ばかりでございます。これはここへ落ちて来るほどの人間は、もう　さまざまな　地獄の　せめく　に疲れはてて、泣声を出す力さえなくなっているのでございましょう。ですからさすが　おおどろぼう　の　かんだた　も、やはり血の池の血にむせびながら、まるで死にかかった　かわず　のように、ただもがいてばかり居りました。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,336,224,336,224,False,14,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"ところがある時の事でございます。なにげ　なく　かんだた　が頭を挙げて、血の池の空を眺めますと、そのひっそりとした闇の中を、遠い遠い天上から、銀色の蜘蛛の糸が、まるで人目にかかるのを恐れるように、ひとすじ　細く光りながら、するすると自分の上へ垂れて参るのではございませんか。かんだた　はこれを見ると、思わず手を　うって喜びました。この糸にすがりついて、どこまでも　のぼって行けば、きっと地獄からぬけ出せるのに相違ございません。いや、うまく行くと、極楽へはいる事さえも出来ましょう。そうすれば、もう針の山へ追い上げられる事もなくなれば、血の池に沈められる事もある筈はございません。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,400,224,400,224,False,13,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"こう思いましたから　かんだた　は、早速その蜘蛛の糸を両手でしっかりとつかみながら、一生懸命に上へ上へとたぐりのぼり始めました。元より　おおどろぼう　の事でございますから、こう云う事には昔から、慣れ切っているのでございます。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,464,224,464,224,False,12,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"しかし地獄と極楽との間は、何万里となくございますから、いくら焦って見た所で、容易に上へは出られません。ややしばらくのぼるうちに、とうとう　かんだた　もくたびれて、もう　ひとたぐりも上の方へはのぼれなくなってしまいました。そこで仕方がございませんから、まず　ひとやすみ　休むつもりで、糸の中途にぶら下りながら、遥かに目の下を見下ろしました。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,528,224,528,224,False,11,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"すると、一生懸命にのぼった甲斐があって、さっきまで自分がいた血の池は、今ではもう暗の底にいつの間にかかくれて居ります。それからあのぼんやり光っている　おそろしい　針の山も、足の下になってしまいました。この分でのぼって行けば、地獄からぬけ出すのも、わけがないかも知れません。かんだた　は両手を蜘蛛の糸にからみながら、ここへ来てから何年にも出した事のない声で、「しめた。しめた。」と笑いました。ところがふと気がつきますと、蜘蛛の糸の下の方には、かず　かぎり　もない罪人たちが、自分ののぼった後をつけて、まるで蟻の行列のように、やはり上へ上へ一心によじのぼって来るではございませんか。かんだた　はこれを見ると、驚いたのと　おそろしい　とで、しばらくはただ、ばか　のように大きな口を開いたまま、眼ばかり動かして居りました。自分一人でさえ切れそうな、この細い蜘蛛の糸が、どうしてあれだけの人数の重みに堪える事が出来ましょう。もし万一途中で切れたと致しましたら、折角ここへまでのぼって来たこの肝腎な自分までも、元の地獄へ　さかおとし　に落ちてしまわなければなりません。そんな事があったら、大変でございます。が、そう云う中にも、罪人たちは　なんびゃく　となく　なんぜん　となく、まっ暗な血の池の底から、うようよ　と這い上って、細く光っている蜘蛛の糸を、一列になりながら、せっせ　と　のぼって参ります。今のうちにどうかしなければ、糸はまん中から二つに切れて、落ちてしまうのに違いありません。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,592,224,592,224,False,10,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"そこで　かんだた　は大きな声を出して、「こら、ざいにんども。この蜘蛛の糸はおれのものだぞ。お前たちは一体誰にきいて、のぼって来た。降りろ。おりろ。」とわめきました。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,656,224,656,224,False,9,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"その途端でございます。今まで何ともなかった蜘蛛の糸が、急に　かんだた　のぶら下っている所から、ぷつりと音を立ててきれました。ですから　かんだた　もたまりません。あっと云う間もなく風を切って、こまのようにくるくるまわりながら、見る見る中に暗の底へ、まっさかさまに落ちてしまいました。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,720,224,720,224,False,8,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"後にはただ極楽の蜘蛛の糸が、きらきらと細く光りながら、月も星もない空の中途に、短く垂れているばかりでございます。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,784,224,784,224,False,7,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"これで第二部は終わり，次は第三部です．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,112,336,112,336,False,6,@</BlockInfo>
																														//@<EndOfBlock/>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.pose,176,336,176,336,False,5,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{0,-900,0,900,0,0,0,0}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
						new Short[]{0,-255,0,180,80,0,180,80,0}
						);
		GlobalVariable.motion.play(pose,3000);
		CRobotUtil.wait(3000);																							//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"御釈迦様は極楽の蓮池のふちに立って、この一部始終をじっと見ていらっしゃいましたが、やがて　かんだた　が血の池の底へ石のように沈んでしまいますと、悲しそうな御顔をなさりながら、またぶらぶら御歩きになり始めました。自分ばかり地獄からぬけ出そうとする、かんだた　の　無慈悲な　心が、そうして　その心　相当　な　罰をうけて、元の地獄へ落ちてしまったのが、御釈迦様の御目から見ると、浅間しく　思召されたのでございましょう。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,336,336,336,336,False,4,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"しかし極楽の蓮池の蓮は、少しもそんな事には　とんじゃく　致しません。その玉のような白い花は、御釈迦様の　おみあし　のまわりに、ゆらゆら　うてな　を動かして、そのまん中にある金色の　ずい　からは、何とも云えない好い匂が、絶間なくあたりへ　溢れて居ります。極楽ももう　ひる　に近くなったのでございましょう。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,400,336,400,336,False,3,@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

}
