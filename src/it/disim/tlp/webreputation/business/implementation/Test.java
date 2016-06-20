package it.disim.tlp.webreputation.business.implementation;

import it.disim.tlp.webreputation.business.implementation.m1_to_m2_transformation.facebookpost2socialdata.*;
import it.disim.tlp.webreputation.business.implementation.m1_to_m2_transformation.twittertweet2socialdata.*;
import it.disim.tlp.webreputation.business.implementation.m2_to_m3_transformation.socialdata2shareddata.*;
import it.disim.tlp.webreputation.business.model.m1.facebookpost.*;
import it.disim.tlp.webreputation.business.model.m1.twittertweet.*;
import it.disim.tlp.webreputation.business.model.m2.socialdata.*;
import it.disim.tlp.webreputation.business.model.m3.shareddata.*;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String args[]) {

		// generate topics
		List<Object> fbtopics = new LinkedList<Object>();
		List<Object> twtopics = new LinkedList<Object>();
		for (int i = 0; i < 5; i++) {
			fbtopics.add(new FbTopic("topic" + i));
			twtopics.add(new TwTopic("topic" + i));
		}

		List<Object> posts = new LinkedList<Object>();
		// generate 3 post
		posts.add(new FbPost(001, "link001", new Date(), "+15", "text001", new Facebook("page001", new FbUser("Mario", "Rossi")), fbtopics, 1));
		posts.add(new Tweet(002, "link002", new Date(), "+41", "text002", new Twitter("page002", new TwUser("Giuseppe", "Verdi")), twtopics, 1));
		posts.add(new FbPost(003, "link003", new Date(), "-16", "text003", new Facebook("page003", new FbUser("Carlo", "Bianchi")), fbtopics, 1));

		
		// transformation check if Post from Facebook, Tweet from Twitter, WikiPage, etc...
		for (Object obj : posts) {
			if (obj instanceof FbPost) {
				// m1_to_m2 transformation
				System.out.println("---Transformating a Facebok Post to a Social Data---");
				Transformation socialdata = new Transformation(obj, new FbPost2SocialData());
				Transformation sdsource = new Transformation(((FbPost) obj).getSorgente(), new Facebook2SDSource());
				Transformation sduser = new Transformation(((FbPost) obj).getSorgente().getAutore(), new FbUser2User());
				Transformation sdtopic = new Transformation(((FbPost) obj).getTopics(), new FbTopic2SDTopic());

				System.out.println((socialdata.getElement().getClass())+": "+((SocialData) socialdata.getElement()).getText());
				System.out.println((sdsource.getElement().getClass())+": "+((SDSource) sdsource.getElement()).getName());
				System.out.println((sduser.getElement().getClass())+": "+((User) sduser.getElement()).getName()+" "+((User) sduser.getElement()).getSurname());
				for (Object topic : sdtopic.getElements()) { System.out.print(((SDTopic) topic).getTopic()+" "); }
				System.out.println();
				// m2_to_m3 transformation
				System.out.println("\n---Transformating a Social Data to a Shared Data---");
				Transformation data = new Transformation(socialdata.getElement(), new SocialData2SharedData());
				Transformation source = new Transformation(sdsource.getElement(), new SDSource2Source());
				Transformation topic = new Transformation(sdtopic.getElements(), new SDTopic2Topic());
				
				System.out.println(data.getElement().getClass()+": "+ ((Data) data.getElement()).getText());
				System.out.println(source.getElement().getClass()+": "+ ((Source) source.getElement()).getName());
				for (Object tpc : topic.getElements()) { System.out.print(((Topic) tpc).getTopic()+" "); }
				System.out.println();
			}
			else if (obj instanceof Tweet) {
				// m1_to_m2 transformation
				System.out.println("---Transformating a Twitter Tweet to a Social Data---");
				Transformation socialdata = new Transformation(obj, new Tweet2SocialData());
				Transformation sdsource = new Transformation(((Tweet) obj).getSorgente(), new Twitter2SDSource());
				Transformation sduser = new Transformation(((Tweet) obj).getSorgente().getAutore(), new TwUser2User());
				Transformation sdtopic = new Transformation(((Tweet) obj).getTopics(), new TwTopic2SDTopic());

				System.out.println((socialdata.getElement().getClass())+": "+((SocialData) socialdata.getElement()).getText());
				System.out.println((sdsource.getElement().getClass())+": "+((SDSource) sdsource.getElement()).getName());
				System.out.println((sduser.getElement().getClass())+": "+((User) sduser.getElement()).getName()+" "+((User) sduser.getElement()).getSurname());
				for (Object topic : sdtopic.getElements()) { System.out.print(((SDTopic) topic).getTopic()+" "); }
				System.out.println();
				// m2_to_m3 transformation
				System.out.println("\n---Transformating a Social Data to a Shared Data---");
				Transformation data = new Transformation(socialdata.getElement(), new SocialData2SharedData());
				Transformation source = new Transformation(sdsource.getElement(), new SDSource2Source());
				Transformation topic = new Transformation(sdtopic.getElements(), new SDTopic2Topic());
				
				System.out.println(data.getElement().getClass()+": "+((Data) data.getElement()).getText());
				System.out.println(source.getElement().getClass()+": "+((Source) source.getElement()).getName());
				for (Object tpc : topic.getElements()) { System.out.print(((Topic) tpc).getTopic()+" "); }
				System.out.println();
			}
			System.out.println("----------------------------------------------------\n");
		}
	}
}
