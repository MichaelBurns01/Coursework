import org.w3c.dom.Node;

public class Q5
{
    public int studentsInFront(int column)
    {
        int student = 0;
        if (studentInFront != null)
        {
            student++;
        }

        else if (studentInFront == null)
        {
            return 0;
        }

        return student;
    }

    public Node studentFront(Node n)
    {
        Node currStudent = n;
        int studentFront = 0;

        if(currStudent == null)
        {
            return 0;
        }

        else if(currStudent != null)
        {
            studentFront++;
            currStudent = currStudent.next;
            return studentFront(currStudent);
        }
    }

    public int studentBack(Node n)
    {
        Node currStuNode = n;
        int studentBack = 0;

        if (currStuNode == null)
        {
            return 0;
        }

        else if(currStuNode != null)
        {
            studentBack++;
            currStuNode = currStuNode.prev;
            return studentBack(currStuNode);
        }
    }
}