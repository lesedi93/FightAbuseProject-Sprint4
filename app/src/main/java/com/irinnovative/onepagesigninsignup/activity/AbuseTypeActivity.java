package com.irinnovative.onepagesigninsignup.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.irinnovative.onepagesigninsignup.R;
import com.irinnovative.onepagesigninsignup.adapter.AbuseAdapter;
import com.irinnovative.onepagesigninsignup.pojo.Abuse;

import java.util.ArrayList;

public class AbuseTypeActivity extends AppCompatActivity {
    ListView lvAbuse;
    ArrayList<Abuse> listAbuse = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abuse_type);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setTitle("Types of Abuse");

        populate();

        lvAbuse = (ListView) findViewById(R.id.card_list_view);
        AbuseAdapter adapter = new AbuseAdapter(this,listAbuse);
        lvAbuse.setAdapter(adapter);
        lvAbuse.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Abuse abuse = listAbuse.get(position);

                Intent intent = new Intent(getBaseContext(), AbuseActivity.class);
                intent.putExtra("content", abuse);
                startActivity(intent);
            }
        });
/*
        lvAbuse.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        lvAbuse.setLayoutManager(layoutManager);

        lvAbuse.addOnItemTouchListener(new RecyclerItemClickListener(this, lvAbuse, new RecyclerItemClickListener
                .OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                //handle click events here
                Abuse abuse = listAbuse.get(position);

                Intent intent = new Intent(getBaseContext(), AbuseActivity.class);
                intent.putExtra("content", abuse);
                startActivity(intent);

            }

            @Override
            public void onItemLongClick(View view, int position) {
                //handle longClick if any
            }
        }));
        */
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == android.R.id.home) {

            onBackPressed();
        }


        return super.onOptionsItemSelected(item);
    }


    public void populate() {


        //final ArrayList<Mentor> listMentors;

        listAbuse.add(new Abuse("Physical Abuse", "Physical abuse is any intentional act causing injury or trauma to another person or animal by way of bodily contact. In most cases, children are the victims of physical abuse, but adults can also be victims, as in cases of domestic violence or workplace aggression." + "\n\n" + "Effects of Physical Abuse " + "\n\n" + "The effects of physical abuse can be both acute and far-reaching. The immediate effect of physical abuse may be a bruise or a cut, but the long-term effect may be drastic - like post-traumatic stress disorder. Moreover, the effects of physical abuse can be felt by loved ones and, especially, children of both the victim and abuser. The psychological effects of physical abuse should not be underestimated." + "\n\n" + "Unfortunately, some of the longest-lasting and most debilitating effects of physical abuse are psychological in nature. Depression is the primary psychological response to physical abuse but drug and alcohol abuse is also common. Abused women have a 16-times greater risk of abusing alcohol and a 9-times greater risk of abusing drugs when compared to non-abused women", R.drawable.physicalabuse));
        listAbuse.add(new Abuse("Emotional Abuse", "An attempt to control a partner through the manipulation of their self-esteem, sense of personal security, " +
                "relationships with others, and/or their perception of reality. Often it results in the victim feeling worthless and responsible for the abuse."+ "\n\n" + "Effects of Emotional Abuse "  + "\n" +
                "\n" +
                "Depression\n" +
                "Withdrawal\n" +
                "Low self-esteem and self-worth\n" +
                "Emotional instability\n" +
                "Sleep disturbances\n" +
                "Physical pain without cause\n" +
                "Suicidal ideation, thoughts or attempts\n" +
                "Extreme dependence on the abuser\n" +
                "Underachievement\n" +
                "Inability to trust\n" +
                "Feeling trapped and alone\n" +
                "Substance abuse",R.drawable.emotionall));
        listAbuse.add(new Abuse("Sexual Abuse", "Any behaviors that impact a person’s ability to control their sexual activity or the circumstances in which sexual activity occurs,Most victims and perpetrators know each other. Immediate reactions to sexual abuse include shock, fear or disbelief. Long-term symptoms include anxiety, fear or post-traumatic stress disorder,while efforts to treat sex offenders remain unpromising, psychological interventions for survivors — especially group therapy — appears effective." +"\n" + "\n\n" + "Effects of Sexual Abuse " + "\n\n"  +"What are common mental effects of sexual assault and rape?\n" +
                "Post-traumatic stress disorder (PTSD), including flashbacks, nightmares, severe anxiety, and uncontrollable thoughts\n" +
                "Depression, including prolonged sadness, feelings of hopelessness, unexplained crying, weight loss or gain, loss of energy or interest in activities previously enjoyed\n" +
                "Suicidal thoughts or attempts. If you or someone you know is feeling suicidal, contact the National Suicide Prevention Lifeline at 1.800.273.8255.\n" +
                "Dissociation, including not being able to focus on work or on schoolwork, as well as not feeling present in everyday situations",R.drawable.sexual));
        listAbuse.add(new Abuse("Digital Abuse", "This is a form of emotional/verbal abuse that uses technology or social media to intimidate, harass, bully, stalk or threaten a current or ex-partner.\n"+ "Digital abuse is very common.\n\n The effect of Digital Abuse \n\nIn fact, 1 in 4 dating teens are harassed through technology.1 Digital abuse can come from anyone – a dating partner, a friend, or an acquaintance. In a world where we are constantly surrounded by technology, it’s important to understand the various forms of abuse that can take place both online and off."+ "What is the impact of digital domestic abuse?\n" +
                "\nThe effects of digital domestic abuse can last long after the experience ends. We found a connection between a history of digital domestic abuse and negative attitudes towards online spaces: More than one third of people who had ever been digitally harassed by a romantic partner in the past also felt that people were “mostly unkind” to one another online. Internet users who had been targeted by a romantic partner were more annoyed, angry, worried, or scared by subsequent online experiences than those who were targeted by someone else"  , R.drawable.digitall));
        listAbuse.add(new Abuse("Financial Abuse", "The use of finances or access to finances to control a partner. It’s one of the powerful forms of abuse, and common method of " +
                "entrapping a partner in the relationship. It’s often given as the reason that victims of abuser stayed in or returned to an abusive relationship.\n\nEffect of Financial Abuse\n\n A family member who repeatedly pressures a\n" +
                "parent for money or borrows money, but never\n" +
                "repays it.\n\n" +
                "A family member who sells a parent's house or\n" +
                "other property and then uses the money for\n" +
                "their own benefit.\n\n" +
                "Adult children who use a parent's pension and" +
                "then make the parent ask them for money.\n\n" +
                "A person who misuses a power of attorney.\n\nSet up your finances so that the bank\n" +
                "automatically pays your bills, especially if your\n" +
                "health changes or you need to go to the hospital\n" +
                "or into a care facility.\n\n" +
                "If you lend money, write down the amount, the\n" +
                "person’s name, and the date you loaned it. This\n" +
                "can help you remember the amount of money\n" +
                "given as a loan or gift.  ", R.drawable.financiall));
        listAbuse.add(new Abuse("Child abuse ", "Child abuse is any action by another person – adult or child – that causes significant harm to a child. It can be physical, sexual or emotional, but can just as often be about a lack of love, care and attention. We know that neglect, whatever form it takes, can be just as damaging to a child as physical abuse.\n\nThe effect of Child Abuse\n\nThe child’s age and developmental status when the abuse or neglect occurred\n" +
                "The type of abuse (physical abuse, neglect, sexual abuse, etc.)\n" +
                "Frequency, duration, and severity of abuse\n" +
                "Relationship between the victim and his or her abuser ( Chalk, Gibbons, & Scarupa, 2002 ).", R.drawable.chil));
        listAbuse.add(new Abuse("Psychological abuse", "Psychological abuse is common and yet few understand the psychological abuse definition enough to spot it. Without the visible signs of physical abuse, psychological abuse can stay hidden for years." + "\n\n" + "Effects of Psychological abuse " + "\n\n" + "Psychological abuse, though, can be just as devastating as physical abuse. Psychological abuse can affect your inner thoughts and feelings as well as exert control over your life.\n\n You may feel uncertain of the world around you and unsafe in your own home. \nPsychological abuse can destroy intimate relationships, friendships and even your own relationship with yourself,\n\nPsychological abuse also applies to children and may impair their development into a healthy adult" + "\n\n" + "Psychological abuse signs and symptoms may start small at first as the abuser \"tests the waters\" to see what the other person will accept, but before long the psychological abuse builds into something that can be frightening and threatening.", R.drawable.psychologicall));
        listAbuse.add(new Abuse("Verbal abuse", "Verbal abuse is the only type of abuse that can affect every single person with any type of communication ability or understanding. You may be assaulted by verbal abuse at work, at home, at school, on the road, or walking through a park, and there is nothing you can do to prevent it. You could even be a victim of verbal abuse if you live alone because if your self-talk, the voice in your head, diminishes you or your belief in yourself in any way, then you subject yourself to verbal abuse when you allow your inner critic to put you down. No one, anywhere, is immune to verbal abuse.  any language or behavior that seeks to coerce its victim to doubt their perceptions or their abilities and subjugate themselves to the abuser." + "\n\n" + "Effects of verbal abuse " + "\n\n" + "The effects of verbal abuse on children, women and men follow the same general principle: verbal abuse causes people to feel fear. However, victims may deny or not recognize their anxiety and feelings of wanting to get away as fear of the abuser." + "\n\n" + "The effects of verbal abuse on women and men range from confusion to symptoms of, or the development of, mental disorders. There is substantially more research studies concerning female victims of verbal abuse, but even so, there are commonalities among victims in general.", R.drawable.verball));
        listAbuse.add(new Abuse("Domestic violence", "Domestic violence occurs when one partner exerts control over the other while dating, during marriage, or cohabitation. Domestic abuse involves injuring someone, such as a spouse, partner, or other family member within the domestic setting. The injuries caused by domestic violence can be either physical or emotional and the effects of domestic abuse often result in lifelong issues long after the victim has left the abusive environment." + "\n\n" + "Effects of Domestic violence" + "\n\n" + "Perpetrators of domestic abuse have serious mental health issues and, in many instances, a self-perception not based in reality. No mistake, action, or sin makes anyone deserving of domestic violence. Abusers want to control their partners and use repetitive accusations and physical abuse to tear down the victim's self worth and, thus, their personal power to escape the situation. They often deny that the abuse occurred, or deny that what they did constitutes abuse, leaving the victim doubting the abuse took place." + "\n\n" + "There is no typical victim profile for domestic violence and abuse. All types of domestic violence can occur in every socioeconomic group, educational and religious background, age group, culture, and nation; and it can happen in same sex relationships as well as traditional heterosexual ones. Even though a typical victim doesn't exist, certain women do have a greater risk for becoming victims of domestic violence and abuse", R.drawable.domesticviolence));


    }
}
