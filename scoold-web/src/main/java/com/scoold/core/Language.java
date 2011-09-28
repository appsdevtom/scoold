/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.scoold.core;

import com.google.common.collect.ImmutableMap;
import com.scoold.core.ContactDetail.ContactDetailType;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.lang.LocaleUtils;
import org.apache.commons.lang.StringUtils;

/**
 *
 * @author alexb
 */
public final class Language {
	
	public static final HashMap<String, Locale> ALL_LOCALES = new HashMap<String, Locale>();

	static {
		for (Object loc : LocaleUtils.availableLocaleList()) {
			Locale locale = new Locale(((Locale) loc).getLanguage());
			ALL_LOCALES.put(locale.getLanguage(), locale);
		}
	}

	private static final Map<String, String> ENGLISH =
		new	ImmutableMap.Builder<String, String>()
			.put("home.title", "Home")
			.put("signin.title", "Sign in")
			.put("signup.title", "Hi, you must be new")
			.put("about.title", "About")
			.put("search.title", "Search")
			.put("myprofile.title", "My Profile")
			.put("profile.title", "Profile")
			.put("privacy.title", "Privacy policy")
			.put("terms.title", "Terms of use")
			.put("faq.title", "FAQ")
			.put("bugs.title", "Bugs")
			.put("contact.title", "Contact us")
			.put("openid.title", "OpenID")
			.put("error.title", "We'll fix it. Eventually.")
			.put("notfound.title", "Not found.")
			.put("settings.title", "Settings")
			.put("translate.title", "Translations")
			.put("contacts.title", "Contacts")
			.put("schools.title", "Schools")
			.put("school.title", "School")
			.put("class.title", "Class")
			.put("photos.title", "Photos")
			.put("groups.title", "Groups")
			.put("drawer.title", "Drawer")
			.put("messages.title", "Messages")
			.put("message.title", "Message")
			.put("classes.title", "Classes")
			.put("suggest.title", "Suggestions")
			.put("people.title", "People")
			.put("comments.title", "Comments")
			.put("comment.title", "Comment")
			.put("reports.title", "Reports")
			.put("media.title", "Media")
			.put("tags.title", "Tags")
			.put("revisions.title", "Revisions")
			.put("questions.title", "Questions")
			.put("answers.title", "Answers")
			.put("badges.title", "Badges")
			.put("blackboard.title", "Blackboard")
			.put("feedback.title", "Feedback")
			.put("accounts.title", "Accounts")
			.put("blog.title", "Blog")
			.put("voterep.title", "Voting and Reputation")
			
			.put("hi", "Hi")
			.put("hello", "Hello!")
			.put("ok", "OK")
			.put("confirm", "Confirm")
			.put("cancel", "Cancel")
			.put("yes", "Yes")
			.put("no", "No")
			.put("send", "Send")
			.put("delete", "Delete")
			.put("deleteall", "Delete all")
			.put("undelete", "Undelete")
			.put("clear", "Clear")
			.put("or", "or")
			.put("continue", "Continue")
			.put("save", "Save")
			.put("back", "Back")
			.put("done", "Done!")
			.put("my", "My")
			.put("remove", "Remove")
			.put("close", "Close")
			.put("click2close", "Click to close")
			.put("dontshow", "Don't show")
			.put("clickedit", "Click to edit")
			.put("edit", "Edit")
			.put("update", "Update")
			.put("change", "Change")
			.put("post", "Post")
			.put("month", "Month")
			.put("day", "Day")
			.put("year", "Year")
			.put("chooseone", "Choose one")
			.put("from", "From")
			.put("to", "To")
			.put("date", "date")
			.put("optional", "optional")
			.put("add", "Add")
			.put("and", "and")
			.put("results", "Results")
			.put(User.UserType.STUDENT.toString(), "Student")
			.put(User.UserType.TEACHER.toString(), "Teacher")
			.put(User.UserType.ALUMNUS.toString(), "Former student")
			.put("students", "Students")
			.put("teachers", "Teachers")
			.put("alumni", "Former students")
			.put("male", "Male")
			.put("female", "Female")
			.put("name", "Name")
			.put("error", "Error")
			.put("unknown", "Unknown")
			.put("restore", "Restore")
			.put("original", "Original")
			.put("admin", "Administrator")
			.put("mod", "Moderator")
			.put("details", "Details")
			.put("newest", "Newest")
			.put("votes", "Votes")
			.put("import", "Import")
			.put("username", "username")
			.put("anonymous", "Anonymous")
			.put("notfound", "Not found.")
			.put("none", "None.")
			.put("active", "Active")
			.put("inactive", "Inactive")
			.put("invited", "Invited")
			.put("r.putation", "R.putation")
			.put("reopen", "Reopen")
			.put("epicfail", "Epic fail!")
			.put("join", "Join")
			.put("leave", "Leave")
			.put(User.Badge.NICEPROFILE.toString(), "Nice Profile")
			.put(User.Badge.TESTER.toString(), "Lab Rat")
			.put(User.Badge.REPORTER.toString(), "Reporter")
			.put(User.Badge.VOTER.toString(), "Voter")
			.put(User.Badge.COMMENTATOR.toString(), "Commentator")
			.put(User.Badge.CRITIC.toString(), "Critic")
			.put(User.Badge.SUPPORTER.toString(), "Supporter")
			.put(User.Badge.EDITOR.toString(), "Editor")
			.put(User.Badge.BACKINTIME.toString(), "Back in Time")
			.put(User.Badge.REGULAR.toString(), "Regular")
			.put(User.Badge.ENTHUSIAST.toString(), "Enthusiast")
			.put(User.Badge.FRESHMAN.toString(), "Freshman")
			.put(User.Badge.SCHOLAR.toString(), "Scholar")
//			.put(User.Badge.TEACHER.toString(), "Teacher")
			.put(User.Badge.PROFESSOR.toString(), "Professor")
			.put(User.Badge.GEEK.toString(), "Geek")
			.put(User.Badge.GOODQUESTION.toString(), "Good Question")
			.put(User.Badge.GOODANSWER.toString(), "Good Answer")
			.put(User.Badge.EUREKA.toString(), "Eureka!")
			.put(User.Badge.SENIOR.toString(), "Senior")
			.put(User.Badge.NOOB.toString(), "Newbie")
			.put(User.Badge.PHOTOLOVER.toString(), "Photo Lover")
			.put(User.Badge.FIRSTCLASS.toString(), "First Class")
			.put(User.Badge.BACKTOSCHOOL.toString(), "Back to School")
			.put(User.Badge.CONNECTED.toString(), "Connected")
			.put(User.Badge.DISCIPLINED.toString(), "Disciplined")
			.put(User.Badge.POLYGLOT.toString(), "Polyglot")
			.put("timeago", "{0} ago")
			.put("links", "Links")
			.put("signout", "Sign out")
			.put("lang", "Language")
			.put("addfriend", "Add to contacts")
			.put("delfriend", "Remove from contacts")
			.put("sendmsg", "Send a message")
			.put("report", "Report")
			.put("reportproblem", "Report a problem")
			.put("nojavascript", "JavaScript is disabled. Weird things can happen.")
			.put("sessiontimeout", "Your session has expired.")
			.put("searching", "Searching...")
			.put("areyousure", "Are you sure you want to do this?")
			.put("identifier", "Identifier")
			.put("prev", "Previous")
			.put("next", "Next")
			.put("addfav", "Add to favourites")
			.put("showall", "Show all")
			.put("preview", "Preview")
			.put("view", "View")
			.put("goback", "Go back")
			.put("minlength", "At least {0} characters are required.")
			.put("maxlength", "Too long. {0} characters max.")
			.put("invite", "Invite people")
			.put(ContactDetailType.XFIRE.toString(), "Xfire")
			.put(ContactDetailType.QQ.toString(), "Tencent QQ")
			.put(ContactDetailType.FACEBOOK.toString(), "Facebook")
			.put(ContactDetailType.TWITTER.toString(), "Twitter")
			.put(ContactDetailType.EBUDDY.toString(), "eBuddy")
			.put(ContactDetailType.SKYPE.toString(), "Skype")
			.put(ContactDetailType.MSN.toString(), "Windows Live")
			.put(ContactDetailType.AIM.toString(), "AOL IM")
			.put(ContactDetailType.YAHOO.toString(), "Yahoo! Messenger")
			.put(ContactDetailType.GTALK.toString(), "Google Talk")
			.put(ContactDetailType.ICQ.toString(), "ICQ")
			.put("contactdetails", "Contact details")
			.put("more", "More")
			.put("success", "Success!")
			.put("addmore", "Add more")
			.put("newbadges", "You've got new badges!")
			.put("newbadge", "You've got a new badge!")
			.put("reputation", "Reputation")
			.put("writehere", "Write here...")
			.put("website", "Website")
			.put("merge", "Merge")
			.put("pagenotfound", "This page cannot be found.")
			.put("forbidden", "You shall not pass!")
			.put("servererror", "Critical server error.")
			.put("sitedown", "System overload!")
			.put("create", "Create")
			.put("pause", "Pause")
			.put("play", "Play")
			.put("address", "Address")
			.put("loading", "Loading...")
			.put("map", "Map")
			.put("points", "points")
			
			.put("school."+School.SchoolType.PRIMARY.toString(), "Primary school")
			.put("school."+School.SchoolType.ELEMENTARY.toString(), "Elementary school")
			.put("school."+School.SchoolType.SECONDARY.toString(), "Secondary school")
			.put("school."+School.SchoolType.HIGHSCHOOL.toString(), "High school")
			.put("school."+School.SchoolType.GYMNASIUM.toString(), "Gymnasium")
			.put("school."+School.SchoolType.LYCEUM.toString(), "Lyceum")
			.put("school."+School.SchoolType.COLLEGE.toString(), "College")
			.put("school."+School.SchoolType.THEOLOGY.toString(), "Theological school")
			.put("school."+School.SchoolType.SEMINARY.toString(), "Seminary")
			.put("school."+School.SchoolType.ACADEMY.toString(), "Academy")
			.put("school."+School.SchoolType.SPECIALIZED.toString(), "Specialized school")
			.put("school."+School.SchoolType.PRIVATE.toString(), "Private school")
			.put("school."+School.SchoolType.UNIVERSITY.toString(), "University")
			.put("school."+School.SchoolType.MIDDLE.toString(), "Middle school")
			.put("school."+School.SchoolType.ARTS.toString(), "Art school")
			.put("school."+School.SchoolType.SPORTS.toString(), "Sports school")

			.put("signup.form.myname", "My name is")
			.put("signup.form.iama", "I am a")
			.put("signup.form.email", "Email")
			.put("signup.form.termsofuse", "Clicking the button above implies that you agree to our 'Terms of use'.")
			.put("signup.form.error.required", "This field is required and cannot be empty.")
			.put("signup.form.error.email", "This email appears to be invalid.")
			.put("signup.form.error.emailexists", "This email is already registered.")
			.put("signup.form.error.year", "Invalid year")

			.put("signin.form.title", "Please sign in")
			.put("signin.facebook", "Sign in with Facebook")
			.put("signin.openid", "Sign in with OpenID")
			.put("signin.openid.text", "OpenID allows you to use an existing account to sign in to multiple websites, without needing to create new passwords. It's a free and easy way to use a single digital identity across the Internet.")
			.put("signin.openid.learn", "Learn more")

			.put("profile.about.title", "About me")
			.put("profile.about.dob", "Date of birth")
			.put("profile.about.location", "Location")
			.put("profile.about.city", "City")
			.put("profile.about.age", "Age")
			.put("profile.about.membersince", "Member since")
			.put("profile.about.lastseen", "Last seen")
			.put("profile.about.aboutme", "More about me")
			.put("profile.about.ilike", "Stuff I like")
			.put("profile.about.usecomma", "Use a comma to separate values.")
			.put("profile.contacts.title", "Contacts")
			.put("profile.contacts.nocontacts1", "You have no contacts.")
			.put("profile.contacts.nocontacts2", "This user has no contacts.")
			.put("profile.contacts.deleted", "This user is no longer your friend.")
			.put("profile.contacts.added", "You have added this user as your friend.")
			.put("profile.status.txt", "Write something here...")
			.put("profile.myschools.add.period", "Period of education")
			.put("profile.myschools.create.type", "School type")
			.put("profile.myschools.create.name", "School name")
			.put("profile.myclasses.gradyear", "Graduation year")
			.put("profile.myclasses.create.schoollink", "Select a school for this class")
			.put("profile.myclasses.create.name", "Class name")
			.put("profile.drawer.share", "Share something...")
			.put("profile.drawer.embedly", "Here you can embed content from any of the services listed below.")
			.put("profile.drawer.embedly.notanimage", "Um, no. This is not an image.")
			.put("profile.drawer.embedly.photosaved", "OK. Saved in photos.")
			.put("profile.thisisme", "This is me!")
			.put("profile.deleted", "Deleted user")
			.put("profile.r.putation", "R.putation")
			.put("profile.posts.noquestions", "No questions.")
			.put("profile.posts.noanswers", "No answers.")

			.put("search.notfound", "Nothing found.")
			.put("search.search", "Search")
			.put("search.people", "Find a person")
			.put("search.schools", "Find a school")
			.put("search.classes", "Find a class")
			.put("search.questions", "Find a question")

			.put("school.create", "Create new school")
			.put("school.created", "Created")
			.put("school.someinfo", "Write some information about this school.")
			.put("school.nocontact", "This school is unreachable. You can fix that.")
			.put("school.noclasses", "This school has no classes.")
			.put("school.nopeople", "This school is empty.")

			.put("classes.noschools", "You don't seem to have any schools linked to your account. You need to join at least one school before you can start creating classes.")
			.put("class.create", "Create new class")
			.put("class.classroom", "Classroom")
			.put("class.classmates", "Classmates")
			.put("class.blankboard", "This blackboard is blank.")
			.put("class.chat", "Chat")
			.put("class.chat.userin", "joined the chat")
			.put("class.chat.userout", "left the chat")
			.put("class.chat.connection.error", "Failed to connect.")
			.put("class.chat.polling.error", "Connection lost. Let's try again...")
			.put("class.chat.reconnect.error", "Reconnecting...")
			.put("class.chat.disconnected", "Disconnected.")
			.put("class.chat.connected", "Connected.")
			.put("class.chat.error", "Could not connect. Let's try again...")
			.put("class.chat.whoshere", "Who's here?")
			.put("class.chat.multierror", "You are already in this chat.")
			.put("class.invitepeople", "Invite people to join this class.")
			.put("class.invite.text", "Hello! You were invited to join a class created by {0}. Follow this link:")
			.put("class.facebookinvite", "Hi! You are invited to join my class at Scoold. Follow this link:")
			.put("class.invitation", "Class invitation")
			.put("class.simpleinvite", "Simple invite/add")

			.put("messages.nomessages", "You have no messages.")
			.put("messages.new", "New message")
			.put("messages.to", "To")
			.put("messages.text", "Text")
			.put("messages.sent", "Message was sent.")

			.put("comments.write", "Add comment")
			.put("comments.show", "Show comment")
			.put("comments.hidden", "Comment was hidden.")

			.put("photos.gallery", "Gallery")
			.put("photos.viewall", "View all")
			.put("photos.labels", "Labels")
			.put("photos.addlabels", "Add labels")
			.put("photos.latest", "Latest photos")
			.put("photos.vieworiginal", "View original")

			.put("settings.authentication", "Authentication settings")
			.put("settings.authentication.text", "Identifiers are your keys to the site. You can have one additional identifer linked to your Scoold account.")
			.put("settings.primaryid", "Primary identifier")
			.put("settings.secondaryid", "Secondary identifier")
			.put("settings.email", "Change Email")
			.put("settings.email.new", "New email address")
			.put("settings.delete", "Delete account")
			.put("settings.delete.text", "Permanently deletes your Scoold account and data, including photos, messages and profile.")
			.put("settings.delete.confirm", "Please confirm that you really want to delete your account.")
	//		.put("settings.clearallmedia", "Clear photos and drawer")
	//		.put("settings.importphotos", "Import your photos")
			.put("settings.tagfilter", "Tag filter")
			.put("settings.tagfilter.text", "You can filter questions by specifying the tags you are interested in.")

			.put("reports."+Report.ReportType.SPAM.toString(), "Spam or commercial content")
			.put("reports."+Report.ReportType.OFFENSIVE.toString(), "Offensive content, violence or abuse.")
			.put("reports."+Report.ReportType.DUPLICATE.toString(), "Duplicate content")
			.put("reports."+Report.ReportType.INCORRECT.toString(), "Incorrect or outdated content.")
			.put("reports."+Report.ReportType.OTHER.toString(), "Other problems, needs attention")
			.put("reports.all", "All reports")
			.put("reports.school", "Schools")
			.put("reports.classunit", "Classes")
			.put("reports.media", "Media")
			.put("reports.post", "Posts")
			.put("reports.user", "Users")
			.put("reports.comment", "Comments")
			.put("reports.translation", "Translations")
			.put("reports.category", "Report category")
			.put("reports.description", "Describe what's wrong")
			.put("reports.actionstaken", "Actions taken")

			.put("tags.tag", "Tag")
			.put("tags.tags", "Tags")
			.put("tags.info", "Tags are used as keywords for questions. Each question is marked with a few tags which describe in essence what that question is about.")
			.put("tags.find", "Find a tag")
			.put("tags.toomany", "Too many tags. Max {0}.")

			.put("posts.question", "Question")
			.put("posts.answer", "Answer")
			.put("posts.posted", "Posted")
			.put("posts.views", "Views")
			.put("posts.answered", "Answered")
			.put("posts.ask", "Ask a question")
			.put("posts.answerit", "Answer")
			.put("posts.title", "Title")
			.put("posts.askit", "Ask")
			.put("posts.writeanswer", "Write your answer")
			.put("posts.youranswer", "Your answer")
			.put("posts.closed", "This question is closed.")
			.put("posts.error1", "Oops! Something went wrong.")
			.put("posts.marked", "Marked for deletion")
			.put("posts.forclosing", "Marked for closing")
			.put("posts.noquestions", "No questions found.")
			.put("posts.updated", "Updated")
			.put("posts.accept", "accept answer")
			.put("posts.schoolfilter", "Filter by school...")
			.put("posts.unanswered", "Unanswered")
			.put("posts.mostpopular", "Most popular questions")
			.put("posts.tagged", "Questions with tag")
			.put("posts.belongsto", "Belongs to")
			.put("posts.noschools", "Questions are linked to schools so in order to ask one you need to join at least one school.")
			.put("posts.unloadconfirm", "Everything you've written will be lost!")
			.put("posts.editby", "Edited by")
			.put("posts.filtered", "Filtered")

			.put("revisions.revision", "Revision")
			.put("revisions.current", "This is the current revision.")

			.put("feedback.write", "Write something")
			.put("feedback.tagged", "Feedback of type")
			.put("feedback.type", "Type of feedback")
			.put("feedback."+Post.FeedbackType.BUG.toString(), "Bug")
			.put("feedback."+Post.FeedbackType.QUESTION.toString(), "Question")
			.put("feedback."+Post.FeedbackType.SUGGESTION.toString(), "Suggestion")
			.put("feedback.reply", "Reply")
			.put("feedback.writereply", "Write a reply")

			.put("translate.select", "Select language")
			.put("translate.translate", "Translate")

			.put("msgcode.1", "Your photos and drawer were cleared.")
			.put("msgcode.2", "Signup failed!")
			.put("msgcode.3", "Authentication failed or was canceled.")
			.put("msgcode.4", "Your account has been deleted.")
			.put("msgcode.5", "You have been signed out.")
			.put("msgcode.6", "OpenID authentication request failed!")
			.put("msgcode.7", "Something went terribly wrong!")
			.put("msgcode.8", "The message was sent.")
			.put("msgcode.9", "You couldn't join this school.")
			.put("msgcode.10", "You've left this school.")
			.put("msgcode.11", "You've joined this school.")
			.put("msgcode.12", "You've added this person to your contacts.")
			.put("msgcode.13", "You've removed this person from your contacts.")
			.put("msgcode.14", "You've joined this class.")
			.put("msgcode.15", "You've left this class.")
			
			.put("about.scoold.1", "Scoold is a student network for knowledge sharing and collaboration. Its primary goal is to help students find the answers to all questions related to their education. But it's not just for students — teachers and former students are welcome, too! Anyone can ask a question about anything related to education.")
			.put("about.scoold.2", "In general, Scoold is all about:")
			.put("about.scoold.3", "learning new stuff,")
			.put("about.scoold.4", "sharing knowledge,")
			.put("about.scoold.5", "gathering and organizing information,")
			.put("about.scoold.6", "helping your mates and earning reputation while doing it.")
			.put("about.scoold.7", "Information is organized around questions. Questions can be specific or they can be in the form of a discussion on a certain topic. Every question can have one or more answers which are sorted by votes. The number of votes indicates the quality of both answers and questions. Almost everything posted on Scoold can be voted up or down.")
			.put("about.scoold.8", "Scoold has been greatly influenced by the sites of the Stack Exchange family and we have huge respect towards the guys behind them. We wanted to create a website based on that clever Q&A model but targeted towards a broader audience, namely students and teachers.")
			
			.put("about.questions.1", "You can ask or discuss anything about education on Scoold. For example you might ask questions about:")
			.put("about.questions.2", "coursework or homework,")
			.put("about.questions.3", "examinations,")
			.put("about.questions.4", "the curriculum,")
			.put("about.questions.5", "learning materials, books and papers,")
			.put("about.questions.6", "research and experiments,")
			.put("about.questions.7", "internal school matters like timetables, graduations or other events.")
			.put("about.questions.8", "Questions are linked to schools, so you need to join at least one school in order to ask a question. This way you can more easily find the information that is only relevant to your school and interests.")
			.put("about.questions.9", "You can, of course, always answer you own question if you know the answer to it. This way you are helping others and it will also earn you some reputation. You can ask as many questions as you want, as long as they don't exist already for a particular school. Duplicate questions might be voted down or even deleted.")
			.put("about.questions.10", "Everything related to Scoold itself should be discussed in the 'Feedback' section. There you can post all your site-related questions, suggestions, general feedback or feature requests.")
			.put("about.questions.11", "A question might be closed for various reasons — it has too many answers, it's a duplicate of another question or it's just inappropriate. Closing a question means that no new answers can be posted but that doesn't affect the editing functionality. A question is automatically marked for closing once it reaches -5 votes.")
			.put("about.questions.12", "Everyone with the 'Teacher' badge can edit questions.")
			
			.put("about.answers.1", "Answers can be posted to any question that hasn't been closed yet. The good answers are always at the top and one of them can be accepted as the best by the author of the question. The accepted answer should be the one that's most helpful to the author of the question, rather than the one with the most votes. You should avoid posting answers that are one or two words long — these should be posted as comments instead (see Comments).")
			.put("about.answers.2", "Everyone with the 'Freshman' badge can edit answers.")

			.put("about.revisions.1", "Every time you edit a question or an answer, a new revision is created. Revisions keep track of all the changes in the text, title and tags of questions and answers. The first revision is the original and it is created automatically. The next edit you make will create revision #1, followed by #2 and so on.")
			.put("about.revisions.2", "You can always switch back to the original or any other revision. Restoring back to the original does not delete any of the previous revisions but creates a new revision with the original text restored.")
			
			.put("about.comments.1", "Comments can be posted on all questions and answers. Basically, anything that's too short for an answer should be a comment. Comments can also contain suggestions, corrections or criticism. Bad comments will be voted down and automatically hidden once they reach -5 votes.")
			.put("about.comments.2", "Everyone with the 'Enthusiast' badge can post comments.")
			
			.put("about.schools.1", "You can create school pages for any kind of school or university that exists around the world. Schools are open for everyone to join. On each school page you can write a brief description and contact information for that school.")
			.put("about.schools.2", "Schools are linked to questions so that every school has a set of questions associated with it. This allows for questions to be organized in a way which allows them to be filtered by school.")
			.put("about.schools.3", "Everyone with the 'Enthusiast' badge can edit schools.")
			
			.put("about.classes.1", "Classes are groups of people who study or have studied together. When creating a class you should specify the year of graduation (which might be in the past) and the school associated with that class. Also you can invite your friends to join you newly created class. ")
			.put("about.classes.2", "Every class has a blackboard where you and your classmates can write anything, leave important messages or reminders. There's also a chat room for each class.")
			.put("about.classes.3", "Everyone with the 'Enthusiast' badge can write on the blackboard.")
						
			.put("about.voterep.1", "Voting is an integral part of Scoold. If you like something useful or interesting, vote it up! Questions that are clear and well-written should also be given +1. The same goes for answers that are helpful. If something is poorly written, unclear, rude or inappropriate, vote it down!")
			.put("about.voterep.2", "Your reputation points measure how much other people trust you and like you. Reputation is earned by posting good questions and answers. It is also awarded with certain badges.")
			.put("about.voterep.3", "Voting is linked to reputation. You earn reputation points when your post gets voted up and you lose points if your post gets voted down. Voting down costs 1 reputation point.")
			.put("about.voterep.4", "If your answer is voted up you get:")
			.put("about.voterep.5", "If your question is voted up you get:")
			.put("about.voterep.6", "If your comment, feedback or translation is voted up you get:")
			.put("about.voterep.7", "If your answer is accepted you get:")
			.put("about.voterep.8", "If you accept an answer to your question you get:")
			.put("about.voterep.9", "If your post gets voted down you loose:")
			.put("about.voterep.10", "If you vote something down you loose:")
			
			.put("about.badges.1", "Badges are only given to those who deserve them. Being friendly and treating people with respect will always earn you badges and reputation points. So be nice and get some of these badges:")
			.put("about.badges.2", "your profile is complete")
			.put("about.badges.3", "for people who helped test the site")
			.put("about.badges.4", "for each report you submit")
			.put("about.badges.5", "voted more than 100 times")
			.put("about.badges.6", "voted down 10 times")
			.put("about.badges.7", "voted up 50 times")
			.put("about.badges.8", "posted 100 comments")
			.put("about.badges.9", "edited your post for the first time")
			.put("about.badges.10", "each time you restore a post from a revision")
			.put("about.badges.11", "accepted an answer to your question for the first time")
			.put("about.badges.12", "reached 100 reputation points")
			.put("about.badges.13", "reached 300 reputation points")
			.put("about.badges.14", "reached 500 reputation points")
			.put("about.badges.15", "reached 1000 reputation points")
			.put("about.badges.16", "reached 5000 reputation points")
			.put("about.badges.17", "reached 9000 reputation points")
			.put("about.badges.18", "your question reached 20 votes")
			.put("about.badges.19", "your answer reached 10 votes")
			.put("about.badges.20", "every time you answer your own question")
			.put("about.badges.21", "your account is one year old")
			.put("about.badges.22", "added 20 photos to your gallery")
			.put("about.badges.23", "joined a class for the first time")
			.put("about.badges.24", "joined a school for the first time")
			.put("about.badges.25", "added 10 contacts")
			.put("about.badges.26", "every time you delete your own comment")
			.put("about.badges.27", "every time your translation is approved")

			.put("about.reports.1", "If you ever notice any problems on Scoold, report them! This includes bugs, missing or incorrect information, abusive, discriminatory or exploitative behavior. Every report you send helps us keep Scoold a nice and friendly place! ")
			
			.put("about.accounts.1", "You don't need to register for an account at Scoold — you simply sign in with your account at Facebook, Google, Yahoo, AOL or any other account that is compatible with OpenID. The first time you sign in, we will only ask you for your name and email address. We promise to keep your email safe and never send you anything, unless it's really important.")
			
			.put("about.feedback.1", "The feedback section is where you can tell us what you think about the site. You can also ask anything about the site itself, describe in details any problems you've encountered or suggest some improvements. So if you think there's something we've missed here, go there and tell us now!")
				
			.build();
	
	public static Map<String, String> readLanguage(Locale loc){
		if(loc == null) return null;
		else if(loc.getLanguage().equals("en")) return getDefaultLanguage();
		else if(!ALL_LOCALES.containsKey(loc.getLanguage())) loc = ALL_LOCALES.get("en");
		return Translation.getTranslationDao().readLanguage(loc);
	}

	public static Locale getProperLocale(String langname){
		langname = StringUtils.substring(langname, 0, 2);
		langname = (StringUtils.isBlank(langname) || !ALL_LOCALES.containsKey(langname)) ?
				"en" : langname.trim().toLowerCase();
		return ALL_LOCALES.get(langname);
	}

	public static Map<String, String> getDefaultLanguage(){
		return ENGLISH;
	}
}
