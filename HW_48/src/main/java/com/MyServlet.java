package com;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("<table><div align = 'center'> " +
                "<th> Mn </th> <th> Tu </th><th> Wd </th><th> Th </th><th> Fr </th><th> St </th><th> Sn </th> " +
                " <tr> <td> </td><td> </td><td> </td><td> </td><td> </td><td> </td><td>1</td> </tr>" +
                " <tr> <td>2</td><td>3</td><td>4</td><td>5</td><td>6</td><td>7</td><td>8</td> </tr>" +
                " <tr> <td>9</td><td>10</td><td>11</td><td>12</td><td>13</td><td>14</td><td>15</td> </tr>" +
                " <tr> <td>16</td><td>17</td><td>18</td><td>19</td><td>20</td><td>21</td><td>22</td> </tr>" +
                " <tr> <td>23</td><td>24</td><td>25</td><td26</td><td>27</td><td>28</td><td>29</td> </tr>" +
                "</div></table>");
    }
}
